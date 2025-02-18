class RecurtionDigitL{
	
	int count = 0;
	int Dlength(int num){

		if(num/10 == 0)
			return 1;

		return Dlength(num/10) + 1;
	}
	public static void main(String[] args){

		RecurtionDigitL obj = new RecurtionDigitL();
		int ret = obj.Dlength(123);
		System.out.println(ret);


	
	}

}
