package stackConcept;

class node{
	int data;
	node next;
	node(int data){
		this.data=data;
	     next=null;
	}
}

class StackLinked{
	node first;
	StackLinked(){
		first=null;
	}
	void push(int data) {
		node newnode=new node(data);
		if(first==null) {
			first=newnode;
			return;
		}
		 newnode.next=first;
		 first=newnode;
	}
	 
	 void pop() {
		 first=first.next;
	 }
	 
	 void isEmpty() {
		 if(first==null) {
			 System.out.println("Stack is Empty");
		 }
		 System.out.println("Stack is not empty");
	 }
	 
	 void display() {
		 node temp=first;
		 while(temp!=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
	 }
}


public class StackLL {
  public static void main(String[] args) {
	  StackLinked s=new StackLinked();
	  s.push(10);
	  s.push(20);
	  s.push(30);
	  
	  s.pop();
	  s.display();
  }
}
