import java.util.*;

class TreeMapDemo {
    public static void main(String[] args) {
        // Create a tree map
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        // Put elements to the map
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        // Get a set of entries
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Display the elements
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

    }
}