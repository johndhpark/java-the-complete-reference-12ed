
// A simple pattern matching demo
import java.util.regex.*;

class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches(); // check for a match

        System.out.println("Testing Java against Java.");
        if (found) {
            System.out.println("Matches");
        } else {
            System.out.println("No Match");
        }

        System.out.println();
    
        mat = pat.matcher("Java SE"); // create a new matcher.

        found = mat.matches(); // check for a match

        if (found) System.out.println("Matches");
        else System.out.println("No Match");
    }
