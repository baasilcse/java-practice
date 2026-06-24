package doublyLinked;

public class DoublyLinked {
    node first;
    node last;
    DoublyLinked(){
    	first=null;
    	last=null;
    }
    void insert(int data) {
    	node newnode=new node(data);
    	if(first==null) {
    		first=last=newnode;
    		return;
    	}
    	last.next=newnode;
    	newnode.prev=last;
    	last=newnode;
    } 
    void insertAtBegining(int data) {
    	node newnode=new node(data);
    	if(first==null) {
    		first=last=newnode;
    		return;
    	}
    	first.prev=newnode;
    	newnode.next=first;
    	first=newnode;
    }
    void insertAtPos(int pos,int val) {
    	
    	if(pos==1) {
    		insertAtBegining(val);
    	}
    	node temp=first;
    	node newnode=new node(val);
    	if(pos<=0) {
    		System.out.println("cant add in negative Index or 0");
    		return;
    	}
    	try {
    	for(int i=1;i<=pos-2;i++) {
    		temp=temp.next;
    	}
    	newnode.next=temp.next;
    	newnode.prev=temp;
    	temp.next.prev=newnode;
    	temp.next=newnode;}
    	catch(Exception e) {
    		System.out.print("Cant insert in that posn\n");
    	}
    }
    
       void deleteAtBegining() {
    	   first=first.next;
    	   first.prev=null;
       }
       
       void deleteAtEnd() {
    	   last=last.prev;
    	   last.next=null;
       }
       
       void deleteBypos(int pos) {
    	   if(pos==1) {
    		   deleteAtBegining();
    	   }
    	   node temp=first;
    	   for(int i=1;i<=pos-2;i++) {
    		   temp=temp.next;
    	   }
    	   temp.next=temp.next.next;
    	   temp.next.prev=temp;
       }
       
       void deleteByVal(int val) {
    	   node temp=first;
    	   if(temp.data==val) {
    		   deleteAtBegining();
    	   }
    	   while(temp.data!=val) {
    		  if(temp.next.data==val) {
    			  temp.next=temp.next.next;
    			  temp.next.prev=temp;
    			  return;
    		  }
    		  temp=temp.next; 
    	   }
       }
       
       
    void update(int pos,int val) {
    	if(pos==1) {
    		first.data=val;
    		return;
    	}
    	node temp=first;
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
    
    void displayRev() {
    	node temp=last;
    	while(temp!=null) {
    		System.out.print(temp.data+" ");
    		temp=temp.prev;
    	}
    }
    
}
