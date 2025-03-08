/*Given an integer array.Find the equilibrium index of the given array such that the sum of the elements at lower indexes is equal to sum of the higher indexes.
NOTE: 1.If there are no elements present at lower or higher indexes then the sum is considered as 0.
      2.Array indexinf statrs from 0.
      3.REturn -1 if there are no indexes found.
      4.If there are more than one equilibrium indexes then return the minimum index.

      INPUT : arr = {-7,1,5,2,-4,3,6}
      OUTPUT : 3
*/
class Equilibrium{
	public static void main(String[] args){
		int arr[] = new int[]{-7,1,5,2,-4,3,0};
		int flag = 0;
		for(int i = 0; i<arr.length;i++){
			int leftsum = 0;
			int rightsum = 0;
			for(int j = 0;j<i;j++){
				leftsum+=arr[j];
			}for(int k = i+1;k<arr.length;k++){
				rightsum+=arr[k];
			}
			if(leftsum == rightsum){
				flag = 1;
				System.out.println(i);
				break;
			}

		}if(flag == 0){
			System.out.println("-1");
		}	
	}
}
