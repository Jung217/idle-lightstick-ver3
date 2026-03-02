package u;

import com.studiothinkers.lightstick.idlev3.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f895a = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f896b = {android.R.attr.layout_gravity};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f897c = {android.R.attr.minWidth};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f898d = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f899e = {android.R.attr.layout, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f900f = {android.R.attr.src, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f901g = {android.R.attr.thumb, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f902h = {android.R.attr.textAppearance, android.R.attr.drawableTop, android.R.attr.drawableBottom, android.R.attr.drawableLeft, android.R.attr.drawableRight, android.R.attr.drawableStart, android.R.attr.drawableEnd};
    public static final int[] i = {android.R.attr.textAppearance, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f903j = {android.R.attr.windowIsFloating, android.R.attr.windowAnimationStyle, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f904k = {R.attr.allowStacking};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f905l = {android.R.attr.button, R.attr.buttonTint, R.attr.buttonTintMode};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f906m = {android.R.attr.gravity, android.R.attr.orientation, android.R.attr.baselineAligned, android.R.attr.baselineAlignedChildIndex, android.R.attr.weightSum, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f907n = {android.R.attr.layout_gravity, android.R.attr.layout_width, android.R.attr.layout_height, android.R.attr.layout_weight};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f908o = {android.R.attr.dropDownHorizontalOffset, android.R.attr.dropDownVerticalOffset};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f909p = {android.R.attr.enabled, android.R.attr.id, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.checkableBehavior};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f910q = {android.R.attr.icon, android.R.attr.enabled, android.R.attr.id, android.R.attr.checked, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.title, android.R.attr.titleCondensed, android.R.attr.alphabeticShortcut, android.R.attr.numericShortcut, android.R.attr.checkable, android.R.attr.onClick, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
    public static final int[] r = {android.R.attr.windowAnimationStyle, android.R.attr.itemTextAppearance, android.R.attr.horizontalDivider, android.R.attr.verticalDivider, android.R.attr.headerBackground, android.R.attr.itemBackground, android.R.attr.itemIconDisabledAlpha, R.attr.preserveIconSpacing, R.attr.subMenuArrow};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f911s = {android.R.attr.popupBackground, android.R.attr.popupAnimationStyle, R.attr.overlapAnchor};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f912t = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f913u = {android.R.attr.focusable, android.R.attr.maxWidth, android.R.attr.inputType, android.R.attr.imeOptions, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f914v = {android.R.attr.entries, android.R.attr.popupBackground, android.R.attr.prompt, android.R.attr.dropDownWidth, R.attr.popupTheme};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f915w = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, R.attr.fontFamily, R.attr.textAllCaps};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f916x = {android.R.attr.gravity, android.R.attr.minHeight, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f917y = {android.R.attr.theme, android.R.attr.focusable, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f918z = {android.R.attr.background, R.attr.backgroundTint, R.attr.backgroundTintMode};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f894A = {android.R.attr.id, android.R.attr.layout, android.R.attr.inflatedId};
}
