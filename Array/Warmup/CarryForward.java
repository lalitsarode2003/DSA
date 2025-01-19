/* Q. Write a program to print the largest no from the array till Kth index
 
	Input: arr:{3,4,5,1,2,7,8,9}
       	       N = 8
       	       K = 3

	Output: 5
*/

class CarryArr{
	public static void main(String [] args){
		int N = 8;
		int arr[] = new int[] {3,4,5,1,2,7,8,9};
		int K = 3;
		int max = Integer.MIN_VALUE;
		for (int i = 0;i<= K;i++){
			if(arr[i]> max){
				max = arr[i];
			}	
		}System.out.println(max);
	}
}
