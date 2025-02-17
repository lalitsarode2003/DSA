

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
