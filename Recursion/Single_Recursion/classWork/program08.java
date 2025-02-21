/*WAP to print the occurance of a specific digit in a no.
 */
class NumOccurance{
	int count =0;
	void occNum(int num,int temp){
		if(num/10 == 0)
			return;
		if(num%10 == temp)
			count++;
		occNum(num/10,temp);
	}
	public static void main(String []args){
		NumOccurance obj = new NumOccurance();
		obj.occNum(133333,3);
		System.out.println(obj.count);
	
	}
}
