import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int minPrice = a[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] < minPrice) {
                minPrice = a[i];
            } else {
                maxProfit = Math.max(maxProfit, a[i] - minPrice);
            }
        }

        System.out.println(maxProfit > 0 ? maxProfit : -1);
    }
}
