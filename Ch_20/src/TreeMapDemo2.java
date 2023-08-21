// Use a comparator to sort accounts by last name.
import java.util.*;

// Compare last whole words in two strings.
class TComp implements Comparator<String> {
    // We know that here, we will have the keys passed in for TreeMa to sort
    public int compare(String aStr, String bStr) {
        int i = aStr.indexOf(" ");
        int j = bStr.indexOf(" ");

        String aSubStr = aStr.substring(i + 1);
        String bSubStr = bStr.substring(j + 1);

        return aSubStr.compareToIgnoreCase(bSubStr);
    }
}

class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        // Put elements to the map
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Todd Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        // Get a set of entries
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //Display the elements
        for (Map.Entry<String, Double> account : set) {
            System.out.print(account.getKey() + ": ");
            System.out.println(account.getValue());
        }
        System.out.println();

        // Deposit 1000 into John Doe's account.
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: + " + tm.get("John Doe"));
    }
}