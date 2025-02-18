class RecurtionSum{

	int sum = 0;

	int Sum (int num){

		if (num == 0)
			return 1;

		sum += num;
		Sum(--num);
		return sum;

	}
	public static void main(String [] args){

		RecurtionSum obj = new RecurtionSum ();
		int ret = obj.Sum(10);
		System.out.println(ret);
	}
}
