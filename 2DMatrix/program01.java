/* Q. given a square matrix print the elements on left diagonal.
 
  	Arr: {{1,2,3},{4,5,6},{7,8,9}};
  	OUTPUT: 1,5,9.

THE FOLLOWING SOLUTION IS DONE USING BOTH 'FOR' AS WELL AS 'WHILE LOOP'.
	*/
class SqMatrix{
	public static void main(String [] args){
		int arr [][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		/*for(int i =0 ;i<arr.length;i++){
			System.out.print(arr[i][i] + " ");
		}*/
		int i = 0;
		int j = 0;
		while(i<arr.length && j<arr.length){
			System.out.print(arr[i][j] + " ");
			i++;
			j++;
		}System.out.println();
	}
}
