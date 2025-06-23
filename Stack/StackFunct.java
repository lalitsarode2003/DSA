import java.util.*;
class StackDemo{
	int maxSize;
	int stackArr[];
	int top = -1;

	StackDemo(int size){
		this.stackArr = new int[size];
		this.maxSize = size;
	}
	void push(int data){
		if(top == maxSize-1){
			System.out.println("Stack overflow");
		}else{
			top++;
			stackArr[top] = data;
		}
	}
	boolean empty(){
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}
	int pop(){
		if(empty()){
			System.out.println("Stack already empty");
			return -1;
		}else{
			int val = stackArr[top];
			top--;
			return val;
		}
	}
	int peek(){
		if(empty()){
			System.out.println("Stack empty");
			return -1;
		}else{
			return stackArr[top];
			
		}
	}
	int size(){
		return top;
	}
	void printStack(){
		if(empty()){
			System.out.println("Stack is empty");
		}else{
			for(int i =0;i<=top;i++){
				System.out.println(stackArr[i]);
			}
		}
	}
}
class Client{
	public static void main(String [] lalit){
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stack size");
		int size = sc.nextInt();
		char ch;
		StackDemo s = new StackDemo(size);
		do{
			System.out.println("1: push");
			System.out.println("2: pop");
			System.out.println("3: peek");
			System.out.println("4: empty");
			System.out.println("5: size");
			System.out.println("6: printStack");
	
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch(choice){
				case 1:{
					System.out.println("Enter data");
					int data = sc.nextInt();
					s.push(data);
				}
				break;
				case 2:{
					int flag = s.pop();
					if(flag != -1)
						System.out.println(flag + "popped");
				}
				break;
				case 3:{
					int flag = s.peek();
					if(flag != -1)
						System.out.println(flag);
				}
				break;
				case 4:{
					boolean val = s.empty();
					if(val){
						System.out.println("Empty");
					}else{
						System.out.println("Not Empty");
					}
					break;
				}
				case 5:{
					int sz = s.size();
					System.out.println(sz + 1);
				}
				break;
				case 6:{
					s.printStack();
				}
				break;
				default:{
					System.out.println("Wrong choice");
				}
				break;
			}
				System.out.println("Continue ?");
				ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
