package BinaryGraph;

public class Main {
	public static void main(String[] args) {
//	Binarytree bt = new Binarytree();
//	bt.insert(10);
//	bt.insert(20);
//	bt.insert(30);
//	bt.displayPreorder(bt.root);
   binarySearchTree bst=new binarySearchTree();
   bst.insert(10);
   bst.insert(5);
   bst.insert(15);
   bst.insert(20);
   bst.displayPre(bst.root);
   System.out.println("");
   bst.displayPos(bst.root);
   System.out.println("");
   bst.displayIn(bst.root);
 }
 }
