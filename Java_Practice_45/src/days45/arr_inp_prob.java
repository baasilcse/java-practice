package days45;
import java.util.*;
public class arr_inp_prob {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[] arr=sc.nextLine().trim().split("\\s+");
		int[] iarr=new int[arr.length];
		
		for(int i=0;i<iarr.length;i++) {
			iarr[i]=Integer.parseInt(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
