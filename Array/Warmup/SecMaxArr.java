/* Q. write a program to print the second largest element of the array.
 	
   	INPUT:{8,4,1,3,9,2,6,7}.
	OUTPUT: 8.
*/
class SecArr{
	public static void main(String[]args){
		int arr[] = new int[]{8,4,1,3,9,2,6,7};
		int secmax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++){
			if(arr[i] > max){
				secmax = max;
				max = arr[i];
			}else if(arr[i]>secmax & arr[i] != max){
			       secmax = arr[i];
			}
		}System.out.println(secmax);
	}
}	

