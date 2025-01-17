/* Q. Write a programm to print the sum of elements of array from start to finish.
 
 suppose: arr: {1,2,3,4,5,6} then output will print (1+6,2+5,3+4) 
 and if   arr: {1,2,3,4,5,6,7} then output will print(1+7,2+6,3+5,4) 
 */

class SumArr{
	public static void main(String [] args){
		int arr[] = new int[] {1,2,3,4,5,6,7};
		int N = 7;
		int sum = 0;
		int i = 0;
		int j = N-1;
		while(i<j){
			sum = arr[i]+arr[j];
			System.out.print(sum + " ");
			i++;
			j--;
		}
		if(i == j){
			System.out.println(arr[i]);
		}
	}
}
