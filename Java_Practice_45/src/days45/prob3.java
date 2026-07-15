package days45;
import java.util.*;
public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = 2;
        int[] start = new int[n];
        for (int i = 0; i < n; i++)
            start[i] = sc.nextInt();
        int m = 2;
        int[] end = new int[m];
        for (int i = 0; i < m; i++)
            end[i] = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int l = start[k] - 1;   
            int r = end[k] - 1;
            while (l <= r && s.charAt(l) != '|')
                l++;
            while (l <= r && s.charAt(r) != '|')
                r--;
            int count = 0;
            if (l < r) {
                for (int i = l + 1; i < r; i++) {
                    if (s.charAt(i) == '*')
                        count++;
                }
            }
            System.out.print(count+" ");
        }}}