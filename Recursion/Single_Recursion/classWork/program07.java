/* WAP to print factorial of a no.
 */
class Factorial{
	//int mult = 1;
	int numFact(int num){
		if(num ==0)
			//return mult;
			return 1;
		//mult *= num;
		//return numFact(--num);
		return num*numFact(--num);

	}
	public static void main(String[]args){
		Factorial obj = new Factorial();
		int ret = obj.numFact(5);
		System.out.println(ret);
	}
}
