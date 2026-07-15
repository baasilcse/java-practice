package days45;
import java.util.*;

public class prob1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String text = sc.nextLine();

        String[] arr = new String[n];

        int i = 0;
        int j = 0;

        while (i < n && j < text.length()) {

            arr[i] = "";

            while (j < text.length() && text.charAt(j) != ' ') {
                arr[i] += text.charAt(j);
                j++;
            }

            while (j < text.length() && text.charAt(j) == ' ') {
                j++;
            }

            i++;
        }

        int[] c = new int[n];

        for (i = 0; i < n; i++) {
            c[i] = arr[i].length();
        }

        int max = -1;
        int maxI = -1;

        for (i = 0; i < n; i++) {
            if (c[i] % 2 != 0 && c[i] > max) {
                max = c[i];
                maxI = i;
            }
        }

        if (maxI == -1) {
            System.out.println("Better luck next time");
        } else {
            System.out.println(arr[maxI]);
        }
    }
}