package days45;
import java.util.*;

class LinaerSearch{
	int searchArr(int [] arr,int target) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	int searchStr(String s,char target) {
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)==target) {
				return i;
			}
		}
		return -1;
	}
	
	int[] searchArr2d(int[][] arr,int target) {
		for (int i=0;i<arr.length;i++) {             // arr.length finds the row size
			for(int j=0;j<arr[0].length;j++) {       // arr[0].length finds the column size
				if(arr[i][j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
}
public class Lin_search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinaerSearch s=new LinaerSearch();
        // linear sort 1d array
//		System.out.print("Enter the size of array :");
//		int n=sc.nextInt();
//		int []arr=new int[n];
//		for (int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.print("Enter the Target :");
//		int target=sc.nextInt();
//		System.out.println("Element found at "+(s.searchArr(arr,target)>-1?s.search(arr,target):"Not found"));

        // first occurance of element in String
//		System.out.print("Enter the String :");
//		String str=sc.next();
//		System.out.print("Enter the Target :");
//		char target=sc.next().charAt(0);
//		System.out.println("Element found at "+(s.searchStr(str,target)>-1?s.searchStr(str,target):"Not found"));

         // 2d array linear sort:	
		System.out.print("Enter row and column :");
		int row=sc.nextInt();
		int col=sc.nextInt();
		System.out.print("Enter the Array elements :");
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(arr.length);
	    System.out.print("Enter the Target :");
	    int target=sc.nextInt();
	    int[] result=s.searchArr2d(arr,target);
	    
	    if(result[0]>-1 && result[1]>-1) {
	    	System.out.print("Present  at {"+result[0]+","+result[1]+"}");
	    }else {
	    	System.out.println("Not Found");
	    }
	}

}
