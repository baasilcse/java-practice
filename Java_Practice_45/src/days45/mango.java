package days45;
import java.util.*;
public class mango {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int t=sc.nextInt();
		int arr[][] =new int[r][c];
		int k=1;
		for (int i=0;i<c;i++) {
	    	for (int j=0;j<r;j++){
	    		arr[j][i]=k;
	    		k++;
	    	}
	    }
		for (int i=0;i<r;i++) {
	    	for (int j=0;j<c;j++) {
          System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println(" ");
	    }
		int flag=0;
	
			for(int i=0;i<r;i++) {
				if(t==arr[i][1]) {
					flag=1;
					break;
				}
			}
			for(int i=0;i<r;i++) {
				if(t==arr[i][c-2]) {
					flag=1;
					break;
				}
		}
		if(flag==1) {
			System.out.println("a Mango Tree");
		}else {
			System.out.println("Not a Mango Tree");
		}
		sc.close();
}}


