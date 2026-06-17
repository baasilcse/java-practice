package days45;
import java.io.*;
import java.util.*;
public class file_ {
  public static void main(String[] args) {
	  try {
		  File f=new File("hello.txt");
		  FileWriter fr = new FileWriter(f);
		  fr.write("Hello \nIm Baasil");
		  fr.close();
		  Scanner sc=new Scanner(f);
	        while(sc.hasNextLine()) {
	            System.out.println(sc.nextLine());
	        }
	        sc.close();
	        }
	   catch(Exception e) {
		  System.out.println("Something went wrong!");
	  }
  }
}
