import java.util.*;

//for Perfect Square
/*class squareRoot{
	static int square(int num){

		int val = 0;
		int itr = 0;
		for(int i = 1;i<=num;i++){
			itr++;
			if (i*i == num)
				val = i;
		}
		System.out.println(itr);
		return val;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ret = square(num); 
		System.out.println(ret);
	}
}*/

//2nd Approach(for any whole no.)
/*class squareRoot{
	static int square(int num){
		int val = 0;
		int itr = 0;
		for(int i=1; i<=num;i++){
			if(i*i<=num)
				val = i;
		}
		System.out.println(itr);
		return val;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ret = square(val);
		Sysrem.out.println(ret);
	}
}*/

//3rd Approach

/*class squareRoot{
	static int square(int num){
		int val = 0;
		int itr = 0;
		for(int i=1; i<=num;i++){
			if(i*i<=num){
				val = i;
		}else{
			break;
		}
		System.out.println(itr);
		return val;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ret = square(val);
		Sysrem.out.println(ret);
	}
}*/

//Optimized
class squareRoot{
	static int square(int num){
		int start = 1;
		int end = num;
		int ans = 0;
		int itr = 0;
		while(start<=end){
			itr++;
			int mid = (start+end)/2;
			int sqr = mid*mid;
			if(sqr == num){
				System.out.println("No. of iterations are:"+  itr);
				return mid;
			}if(sqr>num){
				end = mid-1;
			}else{
				ans = mid;
				start = mid+1;
			}
		}System.out.println("No. of iterations:" + itr);
		return ans;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int ret = square(num);
		System.out.println("Square root is:"+  ret);
	}
}

