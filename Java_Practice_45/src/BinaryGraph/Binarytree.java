package BinaryGraph;

public class Binarytree {
node root;
 Binarytree(){
	 root=null;
 }
 void insert(int val) {

     if (root == null) {
         root = new node(val);
     } else if (root.left == null) {
         root.left = new node(val);
     } else if (root.right == null) {
         root.right = new node(val);
     }
 }
void displayPreorder(node root) {
     if(root==null) {
    	 return;
     }
     System.out.print(root.data+" ");
     displayPreorder(root.left);
     displayPreorder(root.right);
}
void displayPostorder(node root) {
    if (root == null) {
        return;
    }
    displayPostorder(root.left);
    displayPostorder(root.right);
    System.out.print(root.data + " ");
}}
