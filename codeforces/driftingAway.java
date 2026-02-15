
import java.util.*;

public class driftingAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            if (s.chars().allMatch(ch -> ch == '*')) {
                System.out.println(-1);
                continue;
            }
            if (s.contains("><")) {
                System.out.println(-1);
                continue;
            }
            int maxStars = 0, current = 0;
            for (char c : s.toCharArray()) {
                if (c == '*') {
                    current++;
                    maxStars = Math.max(maxStars, current);
                } else {
                    current = 0;
                }
            }

            System.out.println(maxStars);
        }
    }
}
