package days45;
import java.util.*;
public class rightRot {
   public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   int arr[] =new int[sc.nextInt()];
	   for(int i=0;i<arr.length;i++) {
		   arr[i]=sc.nextInt();
	   }
	   //left shift
//	   int temp=arr[0];
//	   for(int i=0;i<arr.length-1;i++) {
//		   arr[i]=arr[i+1];
//	   }
//	   arr[arr.length-1]=temp;
//	   for(int i=0;i<arr.length;i++) {
//		   System.out.print(arr[i]+" ");
//	   }
	   int k=sc.nextInt();
	   for(int j=0;j<k;j++) {
	   int temp=arr[arr.length-1];
	   for(int i=arr.length-1;i>0;i--) {
		   arr[i]=arr[i-1];
	   }
	   arr[0]=temp;}
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   sc.close();
   }
}
