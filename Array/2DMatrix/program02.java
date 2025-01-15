/* Q. given a square matrix print the elements on right diagonal.
 
  	Arr: {{1,2,3},{4,5,6},{7,8,9}};
  	OUTPUT: 3,5,7.
*/
class SqMatrixRight{
	public static void main(String [] args){
		int arr [][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int i = 0;
		int j = 2;
		while(i<arr.length && j>=0){
			System.out.print(arr[i][j] + " ");
			i++;
			j--;
		}System.out.println();
	}
}
