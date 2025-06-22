import java.util.*;
class LinkedList{
	class Node{
		int data;
		Node next = null;
		Node(int data){
			this.data = data;
		}
	}
	Node head = null;
	void addNode( int data){
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
	void recursionLL(Node prev, Node current){
		if(current == null){
			head = prev;
			return;
		}else{
			Node forward = current.next;
			current.next = prev;
			prev = current;
			current = forward;
		}
		recursionLL(prev,current);

	}
}
class Client{
	public static void main(String [] lalit){
		LinkedList ll = new LinkedList();
		
		char ch;
		do{
			System.out.println("1: addNode");
			System.out.println("2: countNode");
			System.out.println("3: rotateLL");
			System.out.println("4. printLL");
			System.out.println("Enter your choice: ");
			Scanner sc = new Scanner(System.in);
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
				case 3 :{
					LinkedList.Node prev = null;
					ll.recursionLL(prev,ll.head);
					      
				}
				break;
				case 4:{
					ll.printLL();
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
