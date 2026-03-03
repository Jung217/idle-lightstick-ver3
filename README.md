# idle-lightstick-ver3

> 透過逆向工程 I-DLE OFFICIAL LIGHT STICK VER.3 官方應援手燈的 Android App 與 Web 前端代碼，解析出其藍牙低功耗 (BLE) 的通訊協定與 **AES 加密機制**。允許開發者脫離官方 App，透過 Web Bluetooth API 結合提取出的硬體金鑰，自行撰寫程式或網頁來直接控制手燈的燈光顏色與閃爍模式。

## 系統架構 (System Architecture)
官方 App 實際上是一個混合式應用 (Hybrid App)：
* **UI 與控制核心**：由網頁 `https://idle.studiothinkers.com` 負責。網頁包含了所有的 UI 介面（開關、調色盤、模式選擇）以及產生控制指令與**執行 AES 加密**的 JavaScript 邏輯。
* **硬體通訊橋樑**：Android/iOS 原生 App 僅作為一個無邏輯的「藍牙發射器」。網頁透過 JavaScript Interface（Android 為 `window.bridge.bleSendCmdList`）將已加密的十六進位 (Hex) 字串傳遞給手機系統，再由系統轉換為 Byte Array 寫入藍牙設備。

## 藍牙通訊協定 (BLE Protocol)
* **Service UUID**: `00000000-0000-1000-8000-00805f9b34fb`
* **Characteristic UUID**: `00000000-0000-1000-8000-00805f9b34fb`
* **寫入方式 (Write Type)**: `WRITE_TYPE_NO_RESPONSE` (Type 2)
* **發送頻率 (Rate Limit)**: 原生 App 端設有每 `70ms` 發送一次的排程器 (ScheduledExecutorService)，以避免藍牙緩衝區溢位與實現燈光時間軸。

## 控制指令與加密機制 (Command Structure & Encryption)
手燈底層晶片具備安全驗證機制，所有寫入特徵值的指令**必須經過 AES 加密**，否則會被手燈判定為無效雜訊。

### 1. 原始指令結構 (Plaintext Payload)
在加密前，一個完整的單色發光指令明文長度為 16 bytes (32 個 Hex 字符)，結構如下：

> **`8201`** + **`[R][G][B]`** + **`0000000000`** + **`FD`** + **`4752415645`**

1. **Header**: `8201` (控制指令標頭)
2. **Color**: `[R][G][B]` (6碼十六進位色碼，如紅色為 `FF0000`)
3. **Padding/Mode**: `0000000000` (保留位元或特定控制模式)
4. **Footer**: `FD`
5. **Signature**: `4752415645` (ASCII 解碼為 `"GRAVE"`，推測為驗證碼或代工廠簽名)

### 2. 核心加密演算法 (AES Encryption)
網頁端組裝好上述明文後，會使用以下規格進行加密，最後將產生的密文 (Ciphertext) 發送給手燈：
* **演算法 (Algorithm)**: `AES-128`
* **模式 (Mode)**: `ECB`
* **填充 (Padding)**: `NoPadding` (因為明文剛好湊滿 16 bytes，無需補零)
* **固定金鑰 (Secret Key)**: `2174516473A1F5351004A13E6B716AB9` (從前端源碼中提取)

### 特殊控制符號 (時間軸邏輯控制)
網頁端發送給原生端的指令實際上是一個陣列（由逗號分隔），除了加密字串外，還包含以下特殊符號用來控制時間軸：
* **`+`**：代表「空拍 / 延遲」。原生端收到 `+` 時不會發送藍牙訊號，僅會消耗一個 70ms 的週期。這被用來精準控制「Flash」與「Party」模式的閃爍節奏與頻閃 (Strobe) 效果。
* **`-`**：代表「停止 / 煞車」。作為指令字串的結尾（如 `,-`），指示原生端關閉發送迴圈。

## Reference
* [decompiler.com](https://www.decompiler.com/)
* [apkpure.com/i-dle-light-stick-ver-3](https://apkpure.com/tw/i-dle-light-stick-ver-3/com.studiothinkers.lightstick.idlev3)
* [github.com/skylot/jadx](https://github.com/skylot/jadx)
* [idle.studiothinkers.com](https://idle.studiothinkers.com/)
* [CryptoJS (AES Encryption)](https://github.com/brix/crypto-js)