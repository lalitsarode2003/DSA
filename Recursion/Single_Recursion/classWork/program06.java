/* WAP to print the sum of digits in a no.
 */
class DigitSum{
	int sum =0;
	int sumD(int num){
		if(num == 0)
			return sum;
		int rem = num%10;
		sum += rem;
		return sumD(num/10);
	}
	public static void main(String[] args){
		DigitSum obj = new DigitSum();
		int ret = obj.sumD(123);
		System.out.println(ret);
	}
}
