package days45;

public class BubbleSort {
	static void SortBub(int[] arr) {
		int n=arr.length;
		boolean flag=true;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					flag=false;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
							}
			if (flag==true) {
				System.out.println("Already Sorted");
				break;
			}

		}
	}
	
	static void SortSelection(int[] arr) {
	       int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {

	            int minIndex = i;

	             for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	        }
	
	       static void SortInsertion(int[] arr) {
	    	   for (int i=1;i<arr.length;i++) {
	    		   int temp=arr[i];
	    		   int j=i-1;
	    		   for(j=i-1;j>=0 && arr[j]>temp;j--) {
	    			   arr[j+1]=arr[j];
	    		   }
	    		   arr[j+1]=temp; 
	    	   }
	       }
	
	public static void main(String[] args) {
		int[] arr= {5,3,4,1,2};
		//SortBub(arr);
		//SortSelection(arr);
		SortInsertion(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
