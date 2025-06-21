import java.util.*;
class DoublyLinkedList{
	class Node{
		int data;
		Node prev = null;
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
			head.prev = newNode;
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
			}
			temp.next = newNode;
			temp.next.prev = temp;
		}
	}
	//Print DLL
	void printDLL(){
		if(head == null){
			System.out.println("LinkedList is empty");
		}else{
			Node temp = head;
			while(temp != null){
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	// Count
	int countNode(){
		int count = 0;
		if(head == null){
			return 0;
		}else{
			Node temp = head;
			while(temp != null){
				count++;
				temp = temp.next;
			}
			return count;
		}
	}
	//Add At Position
	void addAtPos(int data, int pos){
		Node newNode = new Node(data);
		if(pos <= 0 || pos >= countNode() + 2){
			System.out.println("Invalid Position");
		}else if(pos == 1){
			addFirst(data);
		}else if(pos == countNode() + 1){
			addLast(data);
		}else{
			Node temp = head;
			while(pos - 2 != 0){
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
			newNode.next.prev = newNode;
		}
	}
	//Delete First
	void delFirst(){
		if(head == null){
			System.out.println("Empty LinkedList");
		}else if(countNode() == 1){
			head = null;
		}else{
			head = head.next;
			head.prev = null;
		}
	}
	//Delete Last
	void delLast(){
		if(head == null){
			System.out.println("Empty LinkedList");
		}else if(countNode() == 1){
			head = null;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.prev.next = null;
			temp.prev = null;
		}
	}
	//Delete At Position
	void delAtPos(int pos){
		if(pos <= 0 || pos >= countNode() + 1){
			System.out.println("Invalid position ");
		}else if(pos == 1){
			delFirst();
		}else if(pos == countNode()){
			delLast();
		}else{
			Node temp = head;
			while(pos -2 != 0){
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}
	}
}
class Client{

	public static void main(String [] args){
		DoublyLinkedList ll = new DoublyLinkedList();
		
/*		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.printDLL();

		ll.addLast(5);
		ll.printDLL();

		ll.addAtPos(4,25);
		ll.printDLL();
		
		ll.delFirst();
		ll.printDLL();

		ll.delLast();
		ll.printDLL();

		ll.delAtPos(3);
		ll.printDLL();
*/		
		char ch;
		do{
			System.out.println("Doubly LinkedList");
			System.out.println("1: addFirst");
			System.out.println("2: addLast");
			System.out.println("3: addAtPos");
			System.out.println("4: delFirst");
			System.out.println("5: delLast");
			System.out.println("6: delAtPos");
			System.out.println("7: countNode");
			System.out.println("8: printDLL");

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
					ll.addAtPos(data,pos);
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
					ll.printDLL();
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
