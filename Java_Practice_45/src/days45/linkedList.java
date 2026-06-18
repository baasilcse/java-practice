package days45;

public class linkedList {
	node first;
	node last;
	
	linkedList(){
		first=null;
		last=null;
	}
	
	void insert(int data) {
		node newnode =new node(data);
		if(first==null) {
			first=last=newnode;	
		}
		last.next=newnode;
		last=newnode;
	}
	
	void display() {
		node temp=first;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
}