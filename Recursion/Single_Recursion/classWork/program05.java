/* WAP to print whether the entered no. is prime or not
 */
class PrimeCheck{
	static boolean isPrime(int num,int temp){
		if(num <= 2)
			return(num == 2) ? true:false;
		if(num%temp ==0)
			return false;
		if(temp*temp > num)
			return true;
		return isPrime(num,temp+1);
	}
	public static void main(String[] args){
		//PrimeCheck obj = new PrimeCheck();
		//int ret = obj.isPrime(97,2);
		//System.out.println(ret);
		System.out.println(isPrime(8,2));
	}
}
