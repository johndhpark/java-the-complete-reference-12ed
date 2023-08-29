import java.util.*;

class FormatDemo7 {
    public static void main(String[] args) {
        try (Formatter fmt = new Formatter()) {
            fmt.format("Fomratting %s is easy %d %f", "with Java", 10, 98.6);
            System.out.println(fmt);
        }
    }
}