package days45;
import java.util.*;
public class maxRowArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr =new int[r][c];
	    for (int i=0;i<r;i++) {
	    	for (int j=0;j<c;j++) {
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
	    
	    int[] maxArr=new int[c];
	    int max=0;
	    for (int i=0;i<r;i++) {
	    	int sum=0;
	    	for (int j=0;j<c;j++) {
	    		sum+=arr[i][j];
	    		if(sum>max) {
	    			max=sum;
	    			for(int k=0;k<c;k++) {
	    				maxArr[k]=arr[i][k];
	    			}
	    		}
	    	}
	    }
	    System.out.println(max);
	    for (int i=0;i<r;i++) {
	    	System.out.print(maxArr[i]+" ");
	    }
		sc.close();
	}

}
