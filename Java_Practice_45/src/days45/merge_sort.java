package days45;
 
   
public class merge_sort {
	   static  void merge(int arr[],int start,int end,int mid) {    
		     int i = start, j = mid+1, k = 0; 
		     int[] result = new int[end-start+1];
	         while (i <=mid && j <=end) {
	            if (arr[i] < arr[j]) {
	                result[k++] = arr[i++];
	            } else {
	                result[k++] = arr[j++];
	            }
	       }
	        while (i <=mid) {
	            result[k++] = arr[i++];
	        }
	        while (j <= end) {
	            result[k++] = arr[j++];
	        }
	        
	        for(int pos=0;pos<result.length;pos++) {
	            arr[pos+start]=result[pos];
	        }
	    }
	    
	    static void split(int arr[],int start,int end) {
	    	if(start>=end) {
	    		return;
	    	}
	    	 int mid=start+(end-start)/2;
	    	 split(arr,start,mid);
	    	 split(arr,mid+1,end);
	    	 merge(arr,start,end,mid);
	    	 
	    }
   public static void main(String[] args) {
	   int[] arr= {7,1,2,8,6,9};
	   split(arr,0,arr.length-1);
	   for(int num:arr) {
		   System.out.print(num+" ");
	   }
	  
   }
}
