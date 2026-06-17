package days45;
 class Bank{
	private int balance;
	void set_balance(int b) {
		this.balance=b;
	}
	void get_balance(){
		System.out.println(this.balance);
	}
	int g_balance() {
		return this.balance;
	}
}
public class enCap {
	public static void main(String[] args) {
//    Bank a1=new Bank();
//    a1.set_balance(1000);
//    a1.get_balance();
		
		stu ob1=new stu(10,1234);
		stu ob2=new stu(ob1);
		 
		System.out.println(ob2.roll+" "+ob2.phoneno);
	}
}

class stu{
	int roll;
	int phoneno;
	stu(int r,int p){
		this.roll=r;
		this.phoneno=p;
	}
	
	stu(stu ob){
		this.roll=ob.roll;
		this.phoneno=ob.phoneno;
	}
}
