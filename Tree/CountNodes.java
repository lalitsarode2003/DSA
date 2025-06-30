import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		left = right = null;
	}
}
class BinaryTree{

	Scanner sc = new Scanner(System.in);
	Node constructBT(){
		System.out.println("Enter data for Node");
		int data = sc.nextInt();

		Node newNode = new Node(data);

		System.out.println("Do you want to add left node for:" + newNode.data);
		char leftNode = sc.next().charAt(0);
		if(leftNode == 'Y' || leftNode == 'y'){
			newNode.left = constructBT();
		}
		
		System.out.println("Do you want to add right node for:" + newNode.data);
		char rightNode = sc.next().charAt(0);
		if(rightNode == 'Y' || rightNode == 'y'){
			newNode.right = constructBT();
		}
		return newNode;
	}
	int countNodes(Node root){
		if(root == null){
			return 0;
		}
		int LeftSubTree = countNodes(root.left);
		int RightSubTree = countNodes(root.right);
		
		return LeftSubTree + RightSubTree  + 1;

	}
/*
	void preOrderBT(Node root){
		if(root == null)
			return;
		System.out.println(root.data + " ");
		preOrderBT(root.left);
		preOrderBT(root.right);
	}
	void inOrderBT(Node root){
		if(root == null)
			return;
		inOrderBT(root.left);
		System.out.println(root.data + " ");
		inOrderBT(root.right);
	}
	void postOrderBT(Node root){
		if(root == null)
			return;
		postOrderBT(root.left);
		postOrderBT(root.right);
		System.out.println(root.data + " ");
	}
*/
	public static void main(String [] lalit){
		Node root = null;
		BinaryTree bt = new BinaryTree();
		root = bt.constructBT();
		int count = bt.countNodes(root);
		System.out.println(count);
/*		
		System.out.println("Pre Order");
		bt.preOrderBT(root);
		System.out.println("In Order");
		bt.inOrderBT(root);
		System.out.println("Post Order");
		bt.postOrderBT(root);
		
*/		
		System.out.println();
	}
}
