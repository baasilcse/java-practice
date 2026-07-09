package Queue;


class node{
	int data;
	node next;
	node(int val){
		this.data=val;
		this.next=null;
	}
}
class QueueLinkedList{
	node first;
	node last;
	QueueLinkedList(){
		first=null;
		last=null;
	}
	
	void enqueue(int val) {
		node newnode=new node(val);
		if(first==null) {
			first=last=newnode;
		}
		last.next=newnode;
		last=newnode;
	}
	void dequeue() {
		first=first.next;
	}
	
	void display() {
		node temp=first;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
}

public class QueueLL {
	 public static void main(String[] args) {
		  QueueLinkedList q=new QueueLinkedList();
		  q.enqueue(10);
		  q.enqueue(20);
		  q.enqueue(30);
		  
		  q.dequeue();
		  q.display();
}}
