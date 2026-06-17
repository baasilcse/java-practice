package days45;

class mythread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Play Songs"+i);
			System.out.println("lyrics"+i);
			System.out.println("Duration"+i);
		}
	}
}
public class threads {

	public static void main(String[] args) {
		mythread m1=new mythread();
		mythread m2=new mythread();
		m1.start();
		m2.start();
	}
}
