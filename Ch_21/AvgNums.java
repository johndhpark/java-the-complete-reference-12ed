
// Use Scanner to compute an average of the values.
import java.util.*;

class AvgNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Enter numbers to average.");

        while (scan.hasNext()) {
            if (scan.hasNextDouble()) {
                sum += scan.nextDouble();
                ++count;
            } else {
                String cmd = scan.next();

                if (cmd.equals("done"))
                    break;
                else {
                    System.out.println("Data format error.");
                    return;
                }
            }

        }

        scan.close();

        System.out.println("Average is " + sum / count);
    }
}