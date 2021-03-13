import java.util.*;

public class ThreeSwimmers {

    public static long mini(long a, long b, long c) {
        long min = 0;
        if ((a < b) && (a < c)) {
            min = a;
        } else if (b < c) {
            min = b;
        } else {
            min = c;
        }

        return min;
    }

    public static void solve(long p, long a, long b, long c) {
        long ans;
        if (p % a == 0 || p % b == 0 || p % c == 0)
            System.out.println(0);
        else {
            ans = mini(a - p % a, b - p % b, c - p % c);
            System.out.println(ans);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t > 0) {
            long p = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            solve(p, a, b, c);

            t--;
        }

    }
}