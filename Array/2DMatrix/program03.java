/*Q.Given a matrix of size N*M.Print all diagonals from right to left(R->L).
NOTE: Row must always start from the 0th index.

	Input : int arr[][] = new int [][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
	Output : 6 11 16 21
		 5 10 15 20
		 4 9 14 19
		 3 8 13
		 2 7
		 1

BELOW SOLUTION IS WRITTEN IN BOTH FOR{WHILE{}}LOOP AND FOR{FOR{}}LOOP.

Time Complexity = O(N*M).
*/

class RightDiag{
	public static void main(String []args){
		int arr[][] = new int [][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
			int N= 4;
			int M= 6;
			/*for(int j=M-1;j>=0;j--){
				int i = 0;
				int y = j;
				while(i<N && y>=0){
					System.out.print(arr[i][y] + " ");
					i++;
					y--;
				}
			System.out.println();
			}*/
			for(int j=M-1;j>=0;j--){
				int i =0;
				int y =j;
				for(;i<arr.length && y>=0;i++,y--){
					System.out.print(arr[i][y] + " ");
				}System.out.println();
			}
	}

}
