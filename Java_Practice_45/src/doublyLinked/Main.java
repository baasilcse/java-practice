package doublyLinked;

public class Main {

	public static void main(String[] args) {
		DoublyLinked dl=new DoublyLinked();
		dl.insertAtBegining(10);
		dl.insert(20);
		dl.insert(30);
		dl.insert(40);
		//dl.insertAtPos(-1, 33);
		//dl.deleteAtBegining();
		//dl.deleteAtEnd();
		//dl.deleteBypos(3);
		//dl.deleteByVal(30); 
		
		dl.update(3, 100);
		dl.display();
		System.out.println("");
		dl.displayRev();
		
	}

}
