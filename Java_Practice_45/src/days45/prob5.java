package days45;
import java.util.*;
public class prob5 {
//	  public static void main(String[] args) {
//
//	        Scanner sc = new Scanner(System.in);
//	        String s = sc.next();
//
//	        int max = 0;
//	        int count = 0;
//
//	        for (int i = 0; i < s.length(); i++) {
//
//	            count++;
//
//	            if (s.charAt(i) == '@' || s.charAt(i) == '$') {
//	                max = Math.max(max, count);
//	                count = 0;
//	            }
//	        }
//
//	        max = Math.max(max, count);
//	        System.out.println(max);
//	    }
	//prob6
//	 public static void main(String[] args) {
//
//	        Scanner sc = new Scanner(System.in);
//
//	        String s = sc.next();
//
//	        int[] freq = new int[256];
//	        for (int i = 0; i < s.length(); i++) {
//	            freq[s.charAt(i)]++;
//	        }
//
//	        int min = Integer.MAX_VALUE;
//	        char ans = ' ';
//	        for (int i = 0; i < s.length(); i++) {
//
//	            char ch = s.charAt(i);
//
//	            if (freq[ch] < min) {
//	                min = freq[ch];
//	                ans = ch;
//	            }
//	        }
//
//	        System.out.println(ans);
//	    }
	
//	 public static void main(String[] args) {
//
//	        Scanner sc = new Scanner(System.in);
//
//	        int i = sc.nextInt();
//	        int j = sc.nextInt();
//	        int k = sc.nextInt();
//
//	        long sum = 0;
//
//	        
//	        for (int x = i; x <= j; x++) {
//	            sum += x;
//	        }
//
//	        for (int x = j - 1; x >= k; x--) {
//	            sum += x;
//	        }
//
//	        System.out.println(sum);
//	    }
	
	

//	    public static void main(String[] args) {
//
//	        Scanner sc = new Scanner(System.in);
//
//	        int n = sc.nextInt();
//
//	        HashSet<Integer> set = new HashSet<>();
//
//	        int deleted = 0;
//
//	        for (int i = 0; i < n; i++) {
//
//	            int x = sc.nextInt();
//
//	            if (!set.add(x)) {
//	                deleted++;
//	            }
//	        }
//
//	        System.out.println(deleted);
	
	

//	    public static void main(String[] args) {
//
//	        Scanner sc = new Scanner(System.in);
//
//	        String s = sc.next();
//
//	        String ans = s;
//
//	        for (int i = 1; i < s.length(); i++) {
//
//	            String suffix = s.substring(i);
//
//	            if (suffix.compareTo(ans) > 0) {
//	                ans = suffix;
//	            }
//	        }
//
//	        System.out.println(ans);
//	    }
	
	
	    }
	
	

