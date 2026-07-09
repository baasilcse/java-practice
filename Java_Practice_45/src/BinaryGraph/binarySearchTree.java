package BinaryGraph;

public class binarySearchTree {
    node root;
    binarySearchTree(){
    	root=null;
    }
    void insert(int val) {
    	if(root==null) {
    		root=new node(val);
    		return;
    	}
    	node current=root;
    	while(true) {
    		if(val<current.data) {
    			if(current.left==null) {
    				current.left=new node(val);
    				return;
    			}
    			current=current.left;
    		}
    		else {
    			if(val>current.data) {
    				if(current.right==null) {
    					current.right=new node(val);
    					return;
    				}
    			}
    			current=current.right;
    		}
    	}
    }
    
    void displayPre(node root) {
    	if(root==null) {
    		return;
    	}
    	System.out.print(root.data+" ");
    	displayPre(root.left);
    	displayPre(root.right);
    }
    
    void displayPos(node root) {
    	if(root==null) {
    		return;
    	}
    	displayPos(root.left);
    	displayPos(root.right);
    	System.out.print(root.data+" ");
    }
    
    void displayIn(node root) {
    	if(root==null) {
    		return;
    	}
    	displayIn(root.left);
    	System.out.print(root.data+" ");
    	displayIn(root.right);
    }
      
}
