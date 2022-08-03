package p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        Derived d = new Derived();
        System.out.println("SamePackage constructor");
        System.out.println("n = " + p.n);

//      class only
//        System.out.println("n_pri =" + n_pri);

        System.out.println("n_prot = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
