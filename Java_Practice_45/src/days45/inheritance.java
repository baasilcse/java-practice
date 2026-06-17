package days45;
import java.util.*;

class college{
	String clgName="Kgisl Institute of Technology";
	int TotalClass=50;
	int TotalLab=20;
	int noOfStaffs=100;
}
class student extends college{
	String name;
	String classroom;
	String Lab;
	String talent;
	student(String n,String c,String L,String t){
		 name=n;
		 classroom=c;
		Lab=L;
		talent=t;
	}
	void talent() {
		System.out.println(talent);
	}
	void details() {
		System.out.println(name+"\n"+classroom+"\n"+Lab);
	}
}

public class inheritance {
    Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		student stu =new student("Baasil","201c","lab VI","programming");
		System.out.println(stu.clgName);
		stu.details();
		stu.talent();
		 
		}

}
