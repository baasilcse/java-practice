package days45;

public class Main {
    public static void main(String[] args) {
    	linkedList l=new linkedList();
    	l.insert(11);
    	l.insert(12);
    	l.insert(14);
    	l.insert(15);
    	//l.insertAtBegining(10);
    	l.insertAtPosn(13,1);
    	//l.insert(12);
    	//l.deleteByValue(11);
    	//l.deleteAtBegining();
    	l.display();
    }
}
