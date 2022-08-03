package mypack;

public class Balance {
    String name;
    double bal;

    public Balance(String n, double d) {
        name = n;
        bal = d;
    }

    public void show() {
        if (bal < 0) System.out.println("---> ");
        System.out.println(name + ": $" + bal);
    }
}
