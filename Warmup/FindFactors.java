/* Write a program to return the count of factors for a given input.
*/

import java.util.*;
class Factors{

	static int Factors(int num){
		int count = 0;
		int itr = 0;
		for(int i=1;i*i<=num;i++){
			itr++;
			if (num%i == 0){
				if(i == num/i)
					count = count +1;
				else
					count = count+2;
			}
		}
		System.out.println(itr);
		return count;
	}
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int count = Factors(num);
		System.out.println(count);
	}
}
