/* Q. Write a programe to return a count of no of elements in an array having atleast one element greater than itself.
   
	Input: arr:{2,5,1,4,8,0,8,1,3,8}.
	Output: 7.
*/
/* 1st Approach =>[O(N^2)].
 
class ArrDemo{
	public static void main(String[]args){
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int count = 0;
		for (int i = 0 ;i<arr.length;i++){
			for(int j =0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					count++;
					break;
				}
			}
		}System.out.println(count);
	}
}
*/
//Optimised =>[O(N)]
class ArrDemo{
	public static void main(String[]args){
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int count =0;
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		for(int j = 0;j<arr.length;j++){
			if(arr[j] == max){
				count++;
			}
		}
		System.out.println(arr.length-count);
	}
}
