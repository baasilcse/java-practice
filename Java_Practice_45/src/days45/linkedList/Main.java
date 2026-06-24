package days45.linkedList;

public class Main {
    public static void main(String[] args) {
    	linkedList l=new linkedList();
    	l.insert(11);
    	l.insert(12);
    	l.insert(14);
    	l.insert(15);
    	//l.insertAtBegining(10);
    	l.insertAtPosn(13,3);
    	//l.insert(12);
        //l.deleteByValue(13);
    	//l.deleteAtBegining();
    	//l.deleteByPos(3);
       // l.deleteAtEnd();
    	l.update(3, 100);
    	l.display();
    }
}
