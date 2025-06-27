// Two stack using an Array

import java.util.*;

class TwoStacks{
	
	int top1;
	int top2;
	int stackArr[];
	int maxSize;
	TwoStacks(int size){

		this.stackArr = new int[size];
		this.top1 = -1;
		this.top2 = size;
		this.maxSize = size;
	}
	void push1(int data){
		if(top2 - top1 > 1){
			top1++;
			stackArr[top1] = data;
		}else{
			System.out.println("Stack Overflow");
		}
	}
	void push2(int data){
		if(top2 - top1 > 1){
			top2--;
			stackArr[top2] = data;
		}else{
			System.out.println("Stack Overflow");
		}
	}
	int pop1(){
		if(top1 == -1){
			System.out.println("Stack 1 is empty");
			return -1;
		}else{
			int val = stackArr[top1];
			top1--;
			return val;
		}
	}
	int pop2(){
		if(top2 == maxSize){
			System.out.println("Stack 2 is empty");
			return -1;
		}else{
			int val = stackArr[top2];
			top2++;
			return val;
		}
	}

}

class Client{
	public static void main(String [] lalit){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();

		TwoStacks obj = new TwoStacks(size);
		
		char ch;

		do{
			System.out.println("1: push1");
			System.out.println("2. push2");
			System.out.println("3: pop1");
			System.out.println("4: pop2");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch(choice){
				case 1 :{

					System.out.println("Enter element for stack 1");
					int data = sc.nextInt();
					obj.push1(data);
				}
				break;
				case 2 :{

					System.out.println("Enter element for stack 2");
					int data = sc.nextInt();
					obj.push2(data);
				}
				break;
				case 3 :{

					
					int val = obj.pop1();
					if(val != -1)
						System.out.println(val + "popped from stack 1");
				}
				break;
				case 4 :{
					int val = obj.pop2();
					if(val != -1)
						System.out.println(val + "popped from stack 2");
				}
				break;
				default :{ 
					System.out.println("Invalid choice");
					 }
				break;
			}

			System.out.println("Continue?");
			ch = sc.next().charAt(0);

		}while(ch == 'y' || ch == 'Y');	

	}
}
