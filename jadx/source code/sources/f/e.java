package f;

import g.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public WeakReference A0;
    public WeakReference B0;
    public g.b C0;
    public ArrayList j0;
    public e.c k0;
    public g.e l0;
    public c.g m0;
    public boolean n0;
    public e.d o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public b[] t0;
    public b[] u0;
    public int v0;
    public boolean w0;
    public boolean x0;
    public WeakReference y0;
    public WeakReference z0;

    public static void L(d dVar, c.g gVar, g.b bVar) {
        int i;
        int i2;
        if (gVar == null) {
            return;
        }
        int[] iArr = dVar.i0;
        int[] iArr2 = dVar.f548n;
        bVar.f561a = iArr[0];
        bVar.f562b = iArr[1];
        bVar.f563c = dVar.l();
        bVar.f564d = dVar.i();
        bVar.i = false;
        bVar.f569j = 0;
        boolean z2 = bVar.f561a == 3;
        boolean z3 = bVar.f562b == 3;
        boolean z4 = z2 && dVar.P > 0.0f;
        boolean z5 = z3 && dVar.P > 0.0f;
        if (z2 && dVar.o(0) && dVar.f546l == 0 && !z4) {
            bVar.f561a = 2;
            if (z3 && dVar.f547m == 0) {
                bVar.f561a = 1;
            }
            z2 = false;
        }
        if (z3 && dVar.o(1) && dVar.f547m == 0 && !z5) {
            bVar.f562b = 2;
            if (z2 && dVar.f546l == 0) {
                bVar.f562b = 1;
            }
            z3 = false;
        }
        if (dVar.u()) {
            bVar.f561a = 1;
            z2 = false;
        }
        if (dVar.v()) {
            bVar.f562b = 1;
            z3 = false;
        }
        if (z4) {
            if (iArr2[0] == 4) {
                bVar.f561a = 1;
            } else if (!z3) {
                if (bVar.f562b == 1) {
                    i2 = bVar.f564d;
                } else {
                    bVar.f561a = 2;
                    gVar.b(dVar, bVar);
                    i2 = bVar.f566f;
                }
                bVar.f561a = 1;
                int i3 = dVar.Q;
                if (i3 == 0 || i3 == -1) {
                    bVar.f563c = (int) (dVar.P * i2);
                } else {
                    bVar.f563c = (int) (dVar.P / i2);
                }
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                bVar.f562b = 1;
            } else if (!z2) {
                if (bVar.f561a == 1) {
                    i = bVar.f563c;
                } else {
                    bVar.f562b = 2;
                    gVar.b(dVar, bVar);
                    i = bVar.f565e;
                }
                bVar.f562b = 1;
                int i4 = dVar.Q;
                if (i4 == 0 || i4 == -1) {
                    bVar.f564d = (int) (i / dVar.P);
                } else {
                    bVar.f564d = (int) (i * dVar.P);
                }
            }
        }
        gVar.b(dVar, bVar);
        dVar.D(bVar.f565e);
        dVar.A(bVar.f566f);
        dVar.f558y = bVar.f568h;
        int i5 = bVar.f567g;
        dVar.T = i5;
        dVar.f558y = i5 > 0;
        bVar.f569j = 0;
    }

    @Override // f.d
    public final void E(boolean z2, boolean z3) {
        super.E(z2, z3);
        int size = this.j0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.j0.get(i)).E(z2, z3);
        }
    }

    public final void G(d dVar, int i) {
        if (i == 0) {
            int i2 = this.r0 + 1;
            b[] bVarArr = this.u0;
            if (i2 >= bVarArr.length) {
                this.u0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.u0;
            int i3 = this.r0;
            bVarArr2[i3] = new b(dVar, 0, this.n0);
            this.r0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.s0 + 1;
            b[] bVarArr3 = this.t0;
            if (i4 >= bVarArr3.length) {
                this.t0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.t0;
            int i5 = this.s0;
            bVarArr4[i5] = new b(dVar, 1, this.n0);
            this.s0 = i5 + 1;
        }
    }

    public final void H(e.d dVar) {
        e eVar;
        e.d dVar2;
        boolean zM = M(64);
        b(dVar, zM);
        int size = this.j0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            d dVar3 = (d) this.j0.get(i);
            boolean[] zArr = dVar3.L;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar3 instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar4 = (d) this.j0.get(i2);
                if (dVar4 instanceof a) {
                    a aVar = (a) dVar4;
                    for (int i3 = 0; i3 < aVar.k0; i3++) {
                        d dVar5 = aVar.j0[i3];
                        int i4 = aVar.l0;
                        if (i4 == 0 || i4 == 1) {
                            dVar5.L[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            dVar5.L[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            d dVar6 = (d) this.j0.get(i5);
            dVar6.getClass();
            if (dVar6 instanceof f) {
                dVar6.b(dVar, zM);
            }
        }
        if (e.d.f476p) {
            HashSet<d> hashSet = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                d dVar7 = (d) this.j0.get(i6);
                dVar7.getClass();
                if (!(dVar7 instanceof f)) {
                    hashSet.add(dVar7);
                }
            }
            eVar = this;
            dVar2 = dVar;
            eVar.a(this, dVar2, hashSet, this.i0[0] == 2 ? 0 : 1, false);
            for (d dVar8 : hashSet) {
                g.b(this, dVar2, dVar8);
                dVar8.b(dVar2, zM);
            }
        } else {
            eVar = this;
            dVar2 = dVar;
            for (int i7 = 0; i7 < size; i7++) {
                d dVar9 = (d) eVar.j0.get(i7);
                if (dVar9 instanceof e) {
                    int[] iArr = dVar9.i0;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        dVar9.B(1);
                    }
                    if (i9 == 2) {
                        dVar9.C(1);
                    }
                    dVar9.b(dVar2, zM);
                    if (i8 == 2) {
                        dVar9.B(i8);
                    }
                    if (i9 == 2) {
                        dVar9.C(i9);
                    }
                } else {
                    g.b(this, dVar2, dVar9);
                    if (!(dVar9 instanceof f)) {
                        dVar9.b(dVar2, zM);
                    }
                }
            }
        }
        if (eVar.r0 > 0) {
            g.a(this, dVar2, null, 0);
        }
        if (eVar.s0 > 0) {
            g.a(this, dVar2, null, 1);
        }
    }

    public final void I(c cVar) {
        WeakReference weakReference = this.y0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > ((c) this.y0.get()).c()) {
            this.y0 = new WeakReference(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean J(int i, boolean z2) {
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        g.e eVar = this.l0;
        ArrayList arrayList = eVar.f576e;
        e eVar2 = eVar.f572a;
        int iH = eVar2.h(0);
        int[] iArr = eVar2.i0;
        int iH2 = eVar2.h(1);
        int iM = eVar2.m();
        int iN = eVar2.n();
        if (z2 && (iH == 2 || iH2 == 2)) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z4 = z2;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                p pVar = (p) obj;
                if (pVar.f610f == i && !pVar.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && iH == 2) {
                    eVar2.B(1);
                    eVar2.D(eVar.d(eVar2, 0));
                    eVar2.f539d.f609e.d(eVar2.l());
                }
            } else if (z4 && iH2 == 2) {
                eVar2.C(1);
                eVar2.A(eVar.d(eVar2, 1));
                eVar2.f540e.f609e.d(eVar2.i());
            }
        }
        if (i == 0) {
            i2 = 0;
            int i5 = iArr[0];
            if (i5 == 1 || i5 == 4) {
                int iL = eVar2.l() + iM;
                eVar2.f539d.i.d(iL);
                eVar2.f539d.f609e.d(iL - iM);
                i3 = 1;
            }
            i3 = i2;
        } else {
            i2 = 0;
            int i6 = iArr[1];
            if (i6 == 1 || i6 == 4) {
                int i7 = eVar2.i() + iN;
                eVar2.f540e.i.d(i7);
                eVar2.f540e.f609e.d(i7 - iN);
                i3 = 1;
            }
            i3 = i2;
        }
        eVar.g();
        int size2 = arrayList.size();
        int i8 = i2;
        while (i8 < size2) {
            Object obj2 = arrayList.get(i8);
            i8++;
            p pVar2 = (p) obj2;
            if (pVar2.f610f == i && (pVar2.f606b != eVar2 || pVar2.f611g)) {
                pVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i9 = i2;
        while (i9 < size3) {
            Object obj3 = arrayList.get(i9);
            i9++;
            p pVar3 = (p) obj3;
            if (pVar3.f610f == i && (i3 != 0 || pVar3.f606b != eVar2)) {
                if (!pVar3.f612h.f588j || !pVar3.i.f588j || (!(pVar3 instanceof g.c) && !pVar3.f609e.f588j)) {
                    z3 = i2;
                    break;
                }
            }
        }
        z3 = 1;
        eVar2.B(iH);
        eVar2.C(iH2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x08fc  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v9, types: [f.d] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [f.c] */
    /* JADX WARN: Type inference failed for: r15v18, types: [f.d] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v17 */
    /* JADX WARN: Type inference failed for: r23v18 */
    /* JADX WARN: Type inference failed for: r23v19 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v20 */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v22 */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v24 */
    /* JADX WARN: Type inference failed for: r23v25 */
    /* JADX WARN: Type inference failed for: r23v26 */
    /* JADX WARN: Type inference failed for: r23v27 */
    /* JADX WARN: Type inference failed for: r23v28 */
    /* JADX WARN: Type inference failed for: r23v29 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v30 */
    /* JADX WARN: Type inference failed for: r23v31 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v20 */
    /* JADX WARN: Type inference failed for: r24v29 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v30 */
    /* JADX WARN: Type inference failed for: r24v31 */
    /* JADX WARN: Type inference failed for: r24v32 */
    /* JADX WARN: Type inference failed for: r24v33 */
    /* JADX WARN: Type inference failed for: r24v34 */
    /* JADX WARN: Type inference failed for: r24v35 */
    /* JADX WARN: Type inference failed for: r24v36 */
    /* JADX WARN: Type inference failed for: r24v37 */
    /* JADX WARN: Type inference failed for: r24v38 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [e.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r31v0, types: [f.d, f.e] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v33, types: [int] */
    /* JADX WARN: Type inference failed for: r4v67, types: [int] */
    /* JADX WARN: Type inference failed for: r5v54, types: [int] */
    /* JADX WARN: Type inference failed for: r6v103 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v98 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v21, types: [f.d] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v50, types: [g.o] */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10, types: [g.o] */
    /* JADX WARN: Type inference failed for: r8v33, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K() {
        /*
            Method dump skipped, instruction units count: 2332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.K():void");
    }

    public final boolean M(int i) {
        return (this.v0 & i) == i;
    }

    @Override // f.d
    public final void w() {
        this.o0.t();
        this.p0 = 0;
        this.q0 = 0;
        this.j0.clear();
        super.w();
    }

    @Override // f.d
    public final void x(e.c cVar) {
        super.x(cVar);
        int size = this.j0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.j0.get(i)).x(cVar);
        }
    }
}
