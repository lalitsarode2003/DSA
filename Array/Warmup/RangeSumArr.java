/* Q. Write a program to print sum of the given range within an array.
 	
  	Input: arr:{2,5,3,11,7,9,4}
	Output:	2
		5
		30
*/

import java.util.Scanner;
class RangeArr{
	public static void main(String[] args){
		int arr[] = new int[]{2,5,3,11,7,9,4};
		int sum = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the start value:");
		int start = sc.nextInt();
		System.out.println("Enter the end value:");
		int end = sc.nextInt();

		for(int i = start;i <= end;i++){
			sum = sum + arr[i];
		}System.out.println("The sum from " + start +" to " + end + " is " + sum);
	}
}


