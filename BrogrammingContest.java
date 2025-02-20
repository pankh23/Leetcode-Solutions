import java.util.*;

public class BrogrammingContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt(); // Number of test cases

        while (test-- > 0) {
            int n = sc.nextInt(); // Length of string
            String s = sc.next(); // Binary string

            int count1 = 0, count0 = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    count1++;
                } else {
                    count0++;
                }
            }

            // If s contains only 0s, no moves are needed
            if (count1 == 0) {
                System.out.println(0);
            } 
            // If s contains only 1s, we need at least one move
            else if (count0 == 0) {
                System.out.println(1);
            } 
            // Otherwise, the minimum moves required is min(count1, count0)
            else {
                System.out.println(Math.min(count1, count0));
            }
        }

        sc.close();
    }
}
