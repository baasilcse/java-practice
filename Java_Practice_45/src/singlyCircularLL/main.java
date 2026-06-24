package singlyCircularLL;

public class main {

	public static void main(String[] args) {
		SingleCirLL s=new SingleCirLL();
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insertAtBegining(1);
		//s.deleteAtBegining();
		s.deleteAtEnd();
		s.display();
        
	}

}
