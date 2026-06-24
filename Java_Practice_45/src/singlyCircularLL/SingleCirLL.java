package singlyCircularLL;

public class SingleCirLL {
     node first;
     node last;
     SingleCirLL(){
    	 first=null;
    	 last=null;
     }
	 
     void insert(int data) {
    	 node newnode=new node(data);
    	 if(first==null) {
    		 first=last=newnode;
    		 last.next=first;
    	 }
    	 last.next=newnode;
    	 last=newnode;
    	 last.next=first;
     }
     
     void deleteAtBegining() {
    	 first=first.next;
    	 last.next=first;
     }
     
     void deleteAtEnd() {
    	 node temp=first;
    	 while(temp.next.next!=first) {
    		 temp=temp.next;
    	 }
    	 temp.next=first;
     }
     
     void insertAtPos(int pos,int val) {
    	 if(pos==1) {
    		 insert(val);
    	 }
    	 node temp=first;
    	 node newnode=new node(val);
    	 for(int i=1;i<=pos-2;i++) {
    		 temp=temp.next;
    	 }
    	 newnode.next=temp.next;
    	 temp.next=newnode;
     }
     
     void insertAtBegining(int data) {
    	 if (first==null) {
    		 insert(data);
    	 }
    	 node newnode=new node(data);
    	 newnode.next=first;
    	 first=newnode;
    	 last.next=first;
     }
	   
     void display() {
    	 node temp=first.next;
    	 System.out.print(first.data+" ");
    	 while(temp!=null && temp!=first) {
    		 System.out.print(temp.data+" ");
    		 temp=temp.next;
    	 }
     }
}
