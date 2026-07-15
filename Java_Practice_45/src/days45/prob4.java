package days45;
import java.util.*;
public class prob4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        Integer[] power = new Integer[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            power[i] = s.charAt(i) - '0';
            total += power[i];
        }

        
        Arrays.sort(power, Collections.reverseOrder());

        int stephan = 0;

        for (int i = 0; i < n; i++) {
            stephan += power[i];

            if (stephan > total - stephan) {
                break;
            }
        }
        System.out.println(stephan);
        sc.close();
    }
}
