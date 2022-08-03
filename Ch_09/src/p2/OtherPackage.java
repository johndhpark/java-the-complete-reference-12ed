package p2;

public class OtherPackage {
    OtherPackage() {
        System.out.println("Other package constructor");
        p1.Protection p = new p1.Protection();

        System.out.println("n_pub = " + p.n_pub);
    }
}
