package stackConcept;

class StackArray{
	int top;
	int[] arr;
	int capacity;
	StackArray(int size){
		top=-1;
		arr=new int[size];
		capacity=size;
	}
	void push(int val) {
		if(top-1>=capacity) {
			System.out.println("");
		}
		arr[++top]=val;
	}
	int pop() {
		return arr[top--];
	}
	
	boolean isEmpty() {
		if(top==-1) {
			return true; 
		}
		return false;
	}
	boolean isFull() {
		if(top+1>=capacity) {
			return true;
		}
            return false;
	}
}


public class StackArr {
 public static void main(String[] args) {
	 StackArray s=new StackArray(5);
	 s.push(10);
	 s.push(20);
	 s.push(30);
	 s.push(40);
	 s.push(50);
	 //System.out.println(s.pop());
	// System.out.println(s.isEmpty());
	 System.out.println(s.isFull());
 }
      
	
}

