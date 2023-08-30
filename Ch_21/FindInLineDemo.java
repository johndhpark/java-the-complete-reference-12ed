import java.util.*;

class FindInLineDemo {
    public static void main(String[] args) {
        String inStr = "Name: Tom Age: 28 ID: 77";

        Scanner conin = new Scanner(inStr);

        // Find and display age.
        conin.findInLine("Age: "); // find Age

        if (conin.hasNext()) {
            System.out.println(conin.next());
        } else {
            System.out.println("Error!");
        }

        conin.close();
    }
}