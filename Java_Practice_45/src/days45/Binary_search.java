package days45;
import java.util.*;
class SearchBinary{
    static int search_Bin(int []arr,int target) {
    	Arrays.sort(arr);
		int low=0;
		int  high=arr.length-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if (arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}
}

public class Binary_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n=sc.nextInt();
		int []arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the Target :");
		int target=sc.nextInt();
		
		System.out.println((SearchBinary.search_Bin(arr,target)>-1?"Element Found at "+SearchBinary.search_Bin(arr,target):"Not found"));
	}

}
