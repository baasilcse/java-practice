package days45;
public class arr_merge {
	
	    static int[] sort_merge(int[] arr) {  // merge sort when both side sorted
	    	   // index method  
//	    	     int mid=(arr.length/2)-1;    
//	    	     int i = 0, j = mid+1, k = 0; 
//	    	     int[] result = new int[arr.length];
//		         while (i <=mid && j < arr.length) {
//		            if (arr[i] < arr[j]) {
//		                result[k++] = arr[i++];
//		            } else {
//		                result[k++] = arr[j++];
//		            }
//		       }
//		        while (i <=mid) {
//		            result[k++] = arr[i++];
//		        }
//		        while (j < arr.length) {
//		            result[k++] = arr[j++];
//		        }
//		        return result;
	     int mid=(arr.length/2);
	     int p=0;
	    	  int[] arr1 = new int[mid];
		      int[] arr2 = new int[arr.length-mid];
		        for(int i=0;i<arr.length;i++) {
		        	if(i<mid) {
		        		arr1[i]=arr[i];
		        	}else {
		        		arr2[p++]=arr[i];
		        	}
		        }
		        int[] result = new int[arr1.length + arr2.length];
		        int i = 0, j = 0, k = 0;
		        while (i < arr1.length && j < arr2.length) {
		            if (arr1[i] < arr2[j]) {
		                result[k++] = arr1[i++];
		            } else {
		                result[k++] = arr2[j++];
		            }
		       }
		        while (i < arr1.length) {
		            result[k++] = arr1[i++];
		        }
		        while (j < arr2.length) {
		            result[k++] = arr2[j++];
		        }
		        for(int num:result) {
		    		System.out.print(num+" ");
		    	}
		      
		        
		        return result;
	    
	    }
	    public static void main(String[] args) {
//	        int[] arr1 = {1, 3, 5, 7};
//	        int[] arr2 = {2, 4, 6, 8};
//	        int[] result = new int[arr1.length + arr2.length];
//	        int i = 0, j = 0, k = 0;
//	        while (i < arr1.length && j < arr2.length) {
//	            if (arr1[i] < arr2[j]) {
//	                result[k++] = arr1[i++];
//	            } else {
//	                result[k++] = arr2[j++];
//	            }
//	       }
//	        while (i < arr1.length) {
//	            result[k++] = arr1[i++];
//	        }
//	        while (j < arr2.length) {
//	            result[k++] = arr2[j++];
//	        }
//	        for (int num : result) {
//	            System.out.print(num + " "); 
//	        }
	    	int[] arr= {1,3,5,2,4,6};
	    	int arr2[]=sort_merge(arr);
//	    	for(int num:arr2) {
//	    		System.out.print(num+" ");
//	    	}
	    }
	}