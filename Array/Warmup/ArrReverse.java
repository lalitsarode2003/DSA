/* Q. Write a program to print the array in reverse order without using extra space complexity.
  
 	INPUT:{8,4,1,3,9,2,6,7}
	OUTPUT:{7,6,2,9,3,1,4,8}.
*/

class RevArr{
	public static void main(String[] args){

		int arr[] = new int[] {8,4,1,3,9,2,6,7};
		int N = arr.length;
		int i = 0;
		int j = N-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(int k = 0; k< N;k++){
			System.out.print(arr[k] + " ");
		}System.out.println();
	}
}
