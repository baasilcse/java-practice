package days45;

public class excep {
	static void vote(int age) {
	   	if(age<18) {
	   		throw new ArithmeticException("Not Eligible");
	   	}
	}
  public static void main(String[] args) {
	   try {
		   int age=16;
		   vote(age);
	   }catch(ArithmeticException e){
		   System.out.println(e.getMessage());
	   }
  }
}
