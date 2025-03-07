/*WAP to print the max sub-array out of the given array such that the sub-array containes the maximum and minimum element of the array
	Input: arr = {1,2,3,1,3,4,6,4,6,3}
	Output: 6 

*/
class SubArray{
	public static void main(String [] args){
		int N = 10;
		int arr[] = new int[]{1,2,3,1,3,4,6,4,6,3};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int len = 0;
		int minlen = Integer.MAX_VALUE;
		for(int i = 0;i< N;i++){
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		for(int i = 0;i< N;i++){
			if(arr[i] == min){
				for(int j = i+1; j<N;j++){
					if(arr[j]==max){
						len = j-i+1;
					}
					if(minlen > len){
						minlen = len;
					}
				}
			}else if(arr[i] == max){
				for(int j = i+1;j<N;j++){
					if(arr[j] == min){
						len = j-i+1;	
					}
					if(minlen > len){
						minlen = len;
					}
				
				}
			}
		}
		System.out.println(minlen);
	}
}
