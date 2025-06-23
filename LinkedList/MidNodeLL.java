import java.util.*;
class LinkedList{
	Node head = null;
	class Node{
		int data;
		Node next = null;
		Node(int data){
			this.data = data;
		}
	}
	 void addNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	int countNode(){
		int count = 0;
		if(head == null){
			return count;
		}else{
			Node temp = head;
			while(temp != null){
				count++;
				temp = temp.next;
			}
			return count;
		}
	}
	void printLL(){
		if(head == null){
			System.out.println("Empty LinkedList");
		}else{
			Node temp = head;
			while(temp != null){
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	void midNode(){
		Node temp = head;
		int len = countNode();
		int count = 0;
		while(count < len/2){
			count++;
			temp = temp.next;
		}
		System.out.println(temp.data);

	}
}
class Client{
	public static void main(String [] lalit){
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
			System.out.println("1: Add Data");
			System.out.println("2: Count DATA");
			System.out.println("3: Find Middle LinkedList");
			System.out.println("4: Print LinkedList");
			
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();

			switch(choice){

				case 1:{
						System.out.println("Enter data");
						int data = sc.nextInt();
						ll.addNode(data);
				}
				break;
				case 2:{
					int count = ll.countNode();
					System.out.println(count);
				}
				break;
				case 3:{
					       ll.midNode();
				}
				break;
				case 4:{
						ll.printLL();
				}
				break;
				default:{
					System.out.println("Invalid Choice");
				}
				break;
			}
				
				System.out.println("Continue ?");
				ch = sc.next().charAt(0);

		}while(ch == 'y' || ch == 'Y');
	}
}
