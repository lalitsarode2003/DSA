/* WAP a program to print numbers from 1 to 10 in rev order
 */
class RevRecursion{

	void fun(int num){
		
		if(num == 0)
			return;

		System.out.println(num);

		fun(--num);
	}
	public static void main(String[]args){

		RevRecursion obj = new RevRecursion();
		obj.fun(10);
	}
}
