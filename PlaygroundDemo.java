class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

// Functional Interface
interface FunctionalFunc {
    int func(int a, int b);
}

class PlaygroundDemo {
    public static void main(String[] args) {
        int result = MathUtils.add(5, 3);
        System.out.println("Result: " + result); // Output: Result: 8

        FunctionalFunc testing = MathUtils::add;
        int other_res = testing.func(10, 5);
        System.out.println("Other Result" + other_res);

    }
}