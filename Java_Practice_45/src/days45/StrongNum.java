package days45;
import java.util.*;
public class StrongNum {
	static int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*fact(n-1);
		}}
	static boolean arms(int n) {
		 int sum=n;
		 //int num1=n;
		   while(n>0) {
			  int temp=n%10;
			  sum-=fact(temp);
			  n=n/10;
		   }
		   if(sum==0) {
			   return true;
		   }else {
			   return false;
		   }}
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   System.out.println(arms(num));
   }
}
