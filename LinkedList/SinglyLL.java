import java.util.*;

/*
class Node{
	int data;
	Node next = null;
	Node(int data){
		this.data = data;
	}
}
*/
class LinkedList{
	class Node{
		int data;
		Node next = null;
		Node(int data){
			this.data = data;
		}
	}
	Node head = null;
	//Add First
	void addFirst(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}
	//Add Last
	void addLast(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}temp.next = newNode;
		}
	}
	//Print LinkedList
	void printSLL(){
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
	//Count
	int countNode(){
		int count = 0;
		if(head == null){
			return count;
		}else{
			Node temp = head;
			while(temp != null){
				count++;
				temp = temp.next;
			}return count;
		}
	}
	//Add At Position
	void addAtPos(int pos,int data){
		Node newNode = new Node(data);
		if(pos <= 0 || pos >= countNode()+2){
			System.out.println("Invalid position");
		}else if(pos == 1){
			addFirst(data);
		}else if(pos == countNode() + 1){
			addLast(data);
		}else{
			Node temp = head;
			while( pos-2 != 0){
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	//Delete First
	void delFirst(){
		if(head == null){
			System.out.println("Empty LinkedList");
		}else if( countNode() == 1){
			head = null;
		}else{
			head = head.next;
		}
	}
	//Delete Last
	void delLast(){
		if(head == null){
			System.out.println("LinkedList is Empty");
		}else if(countNode() == 1){
			head = null;
		}else{
			Node temp = head;
			while(temp.next.next != null){
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	//Delete At Position
	void delAtPos(int pos){
		if(pos <= 0 || pos >= countNode()+1){
			System.out.println("Invalid Position");
		}else if(pos == 1){
			delFirst();
		}else if(pos == countNode()){
			delLast();
		}else{
			Node temp = head;
			while( pos-2 != 0){
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
		}
	}
}
class Client{
	public static void main(String[] lalit){
		LinkedList ll = new LinkedList();
/*		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.printSLL();

		ll.addLast(5);
		ll.printSLL();

		ll.addAtPos(4,25);
		ll.printSLL();
		
		ll.delFirst();
		ll.printSLL();

		ll.delLast();
		ll.printSLL();

		ll.delAtPos(3);
		ll.printSLL();
*/		
		char ch;
		do{
			System.out.println("Singly LinkedList");
			System.out.println("1: addFirst");
			System.out.println("2: addLast");
			System.out.println("3: addAtPos");
			System.out.println("4: delFirst");
			System.out.println("5: delLast");
			System.out.println("6: delAtPos");
			System.out.println("7: countNode");
			System.out.println("8: printSLL");

			System.out.println("Enter your choice: ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch(choice){
				case 1:{
					System.out.println("Enter data");
					int data = sc.nextInt();
					ll.addFirst(data);
				}
				break;
				case 2:{
					System.out.println("Enter data");
					int data = sc.nextInt();
					ll.addLast(data);
				}
				break;
				case 3:{
					System.out.println("Enter data");
					int data = sc.nextInt();
					System.out.println("Enter pos");
					int pos = sc.nextInt();
					ll.addAtPos(pos,data);
				}
				break;
				case 4:{
					ll.delFirst();
				}
				break;
				case 5:{
					ll.delLast();
				}
				break;
				case 6:{
					System.out.println("Enter the position");
				 	int pos = sc.nextInt();	
					ll.delAtPos(pos);
				}
				break;
				case 7:{
					int count = ll.countNode();
					System.out.println(count);
				}
				break;
				case 8:{
					ll.printSLL();
				}
				break;
				default:{
						System.out.println("Wrong choice");
				}
				break;
			}
				System.out.println("Continue ?");
				ch = sc.next().charAt(0);

		}while( ch == 'Y' || ch == 'y');
	}
}
