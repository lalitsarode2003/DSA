/* Q. Write a programe to print the count of pairs in array such that two elements in array must have sum equal to 'k'.
 NOTE: i != j
	
 	INPUT:
   	k = 10;
	N = 10;
	arr = {3,5,2,1,-3,7,8,15,6,13}

	OUTPUT:6.

*/
class PairArr{
	public static void main(String[] args){

		int N = 10;
		int k = 10;
		int arr[] = new int[]{3,5,2,1,-3,7,8,15,6,13};
		int count = 0;

		for(int i = 0;i<N;i++){
			for(int j = i+1;j<N;j++){
				if(arr[i] + arr[j] == k & i != j){
					count ++;
				}
			}
		}System.out.println(count*2);
	}
}
