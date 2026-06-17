package days45;

class parent{
	parent(){
		System.out.println("parent Constructor!");
	}
	int a=10;
}

class child extends parent{
	int a=20;
	child(){
		super();
	}
}

public class superK {

	public static void main(String[] args) {
		child c=new child();
		
	}

}
