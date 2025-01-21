/*Q. Given an integer array of size N.
     Build an array  'leftMax' of size N.
     leftMax of i contains maximum for the index 0 to the index i.

     	INPUT: arr:{-3,6,2,4,5,2,8,-9,3,1}
	N = 10
	OUTPUT: {-3,6,6,6,6,6,8,8,8,8} 
*/

class LeftArr{
	public static void main(String[]args){
		int arr [] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N = 10;
		int leftMax [] = new int[N];
		leftMax[0] = arr[0];
		
		for(int i = 1;i<N;i++){
			int max = Integer.MIN_VALUE;
				for(int j = 0;j<=i;j++){
					if(arr[j]>max){
						max = arr[j]; 
					}
				}leftMax[i]= max;
		}

		for(int i = 0 ;i<N;i++){
			System.out.print(leftMax[i] + " ");
		}System.out.println();
	}
}
