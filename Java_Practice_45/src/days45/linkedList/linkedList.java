package days45.linkedList;

public class linkedList {
	node first; //head
	node last;   //tail
	linkedList(){
		first=null;
		last=null;
	}
	void insert(int data) {
		node newnode =new node(data);
		if(first==null) {
			first=last=newnode;	
			return;
		}           
		last.next=newnode;
		last=newnode;
	}
	
	void insertAtBegining(int data) {
		node newnode=new node(data);
		newnode.next=first;
		first=newnode;
	}
	
	void insertAtPosn(int data,int posn) {
	    if(posn==1) {
	    	insertAtBegining(data);
	    	return;
	    }
		node temp=first;
		node newnode =new node(data);
		for(int i=1;i<=posn-2;i++) {  // pos-2 because to insert at posn n,we need to traverse before the 2 iteration before
			temp=temp.next;
		}
		newnode.next=temp.next;          // first we updated the newnode's next then we update the temp's next (because if we changed the temp'next first ,then reference for rightside node is lost  )
		temp.next=newnode;
	}
	
	void deleteAtBegining() {
		first=first.next;
	}
	
	void deleteByValue(int val) {
		node temp=first;
		 
		if(temp!=null && temp.data==val) {
			first=temp.next;
			return;
		}
		
		
//		while(temp!=null) {
//			if(temp.next.data==val) {
//				temp.next=temp.next.next;
//				break;
//			}
//			temp=temp.next;
//		}
		
		
		while(temp.data!=val && temp!=null) {
			if(temp.next.data==val) {
				temp.next=temp.next.next;
				return;
			}
			temp=temp.next;
		}
	}
	
	void deleteByPos(int pos){
		node temp=first;
		 if(pos==1) {
			 deleteAtBegining();
			 return;
		 }
		 for(int i=1;i<=pos-2;i++) {
			 temp=temp.next;
		 }
		 temp.next=temp.next.next;
	}
	
	void deleteAtEnd() {
		node temp=first;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	  
	void update(int pos,int val) {
		node temp=first;
		if(pos==1) {
			temp.data=val;
		}
		for(int i=1;i<=pos-1;i++) {
			temp=temp.next;
		}
		temp.data=val;
	}
	void display() {
		node temp=first;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}	
	}
}