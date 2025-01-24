/*Q. Given an integer array of size N.
     Build an array  'rightMax' of size N.
     rightMax of i contains maximum for the index 0 to the index i.

     	INPUT: arr:{-3,6,2,4,5,2,8,-9,3,1}
	N = 10
	OUTPUT: {8,8,8,8,8,8,8,3,3,1}
*/

class RightArr{
	public static void main(String[]args){
		int arr[] = new int []{-3,6,2,4,5,2,8,-9,3,1};
		int N = 10;
		int max = Integer.MIN_VALUE;
		int rightMax[] = new int[N];
		rightMax[N-1] = arr[N-1];
		for(int i = N-2;i>=0;i--){
			if(rightMax[i+1] < arr[i]){
				rightMax[i] = arr[i];
			}else{
				rightMax[i] = rightMax[i+1];
			}
		}
		for(int i = 0;i<N;i++){
			System.out.print(rightMax[i] + " ");
		}System.out.println();	

	}
}

