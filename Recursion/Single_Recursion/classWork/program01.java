/* WAP a program to print the numbers from 1 to 10
*/

class Recursion{

	void fun(int num){
		
		if(num == 0)
			return;
		fun(num-1);
		System.out.println(num);
	}
	public static void main(String[]args){

		Recursion obj = new Recursion();
		obj.fun(10);
	}
}
