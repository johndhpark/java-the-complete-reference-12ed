// Use thenComparing() to sort by last, then first name.
import java.util.*;

// A comparater that compare last names
class CompLastName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i = o1.indexOf(" ");
        int j = o2.indexOf(" ");

        String subStr1 = o1.substring(i + 1);
        String subStr2 = o2.substring(j + 1);

        return subStr1.compareToIgnoreCase(subStr2);
    }
}

class CompFirstName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);

    }
}


class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastName compLN = new CompLastName();
        CompFirstName compFN = new CompFirstName();
        Comparator<String> compFirstThenLast = compFN.thenComparing(compLN);

        // Create a tree map.
        TreeMap<String, Double> tm = new TreeMap<>(compFirstThenLast);
        
        // Put elements to the map
        tm.put("John Smith", 123.22);
        tm.put("John Doe", 3434.34);
        tm.put("Jane Baker", 1378.00);
        tm.put("Todd Hall", 99.22);
        tm.put("Ralph Smith", -19.08);  

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> entry : set) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        System.out.println();

        // Deposit 1000 into John Doe's account.
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}