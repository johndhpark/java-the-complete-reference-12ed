// Map one stream to another.

import java.util.*;
import java.util.stream.*;

class StreamDemo4 {
    public static void main(String[] args) {

        // A list of double values.
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        // Map the square root of the elements in myList to a new stream.
        Stream<Double> sqrtRootStream = myList.stream().map((a) -> Math.sqrt(a));

        // Find the product of the square roots.
        double productOfSqrtRoots = sqrtRootStream.reduce(1.0, (a, b) -> a * b);

        System.out.println("Product of squart roots is " + productOfSqrtRoots);
    }
}