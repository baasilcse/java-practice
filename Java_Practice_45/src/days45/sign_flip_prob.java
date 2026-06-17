package days45;
import java.util.*;
public class sign_flip_prob {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt();
	   }
	   int k=sc.nextInt();
	   Arrays.sort(arr);
	   while(k!=0) {
		   arr[0]=arr[0]*-1;
		   Arrays.sort(arr);
		   k--;
	   }
	   int count=0;
	   for(int i=0;i<arr.length;i++) {
		    count+=arr[i];
	   }   
	   System.out.println(count);
   }
}
