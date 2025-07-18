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
class BinaryTreeCount{
	
	int index = -1;
	Node constructBT(int arrNodes[]){
		index++;
		
		if(arrNodes[index] == -1){
			return null;
		}

		Node newNode = new Node(arrNodes[index]);

		newNode.left = constructBT(arrNodes);
		newNode.right = constructBT(arrNodes);

		return newNode;
	}
	void preOrderBT(Node root){
		if(root == null)
			return;
		System.out.print(root.data + " ");
		preOrderBT(root.left);
		preOrderBT(root.right);
	}
	void inOrderBT(Node root){
		if(root == null)
			return;
		inOrderBT(root.left);
		System.out.print(root.data + " ");
		inOrderBT(root.right);
	}
	void postOrderBT(Node root){
		if(root == null)
			return;
		postOrderBT(root.left);
		postOrderBT(root.right);
		System.out.print(root.data + " ");
	}
	int countNode(Node root){
		if(root == null){
			return 0;
		}	
		int LeftSubTree = countNode(root.left);
		int RightSubTree = countNode(root.right);

		return LeftSubTree + RightSubTree + 1;
	}
	
	void levelOrder(Node root){
		Queue<Node> que = new LinkedList<>();

		que.add(root);
		que.add(null);
		while(!que.isEmpty()){
			Node tempNode = que.remove();

			if(tempNode == null){
				System.out.println();

				if(que.isEmpty()){
					break;
				}else{
					que.add(null);
				}
			}

			else{ 
				System.out.println(tempNode.data + " ");

				if(tempNode.left != null){
					que.add(tempNode.left);
				}
				if(tempNode.right != null){
					que.add(tempNode.right);
				}

			}
	}
	public static void main(String [] args){
		int arrNodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTreeCount bt = new BinaryTreeCount();
		Node root = bt.constructBT(arrNodes);

		
		System.out.println("Pre Order");
		bt.preOrderBT(root);
		
		System.out.println();
		System.out.println("In Order");
		bt.inOrderBT(root);
		System.out.println();
		
		System.out.println("Post Order");
		bt.postOrderBT(root);
		
		System.out.println();
		int count = bt.countNode(root);
		System.out.println("Total no of nodes are:" + count);
		
		bt.levelOrder(root);
		System.out.println();
	}
}
