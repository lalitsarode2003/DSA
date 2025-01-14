/* Q. Write a program to reverse an array
*/
class ArrDemo{
	public static void main(String[] args){
		int arr[] = new int[]{8,4,1,3,9,2,6,7};
		int N = 8;
		int i = 0;
		int j = N-1;
		while(i<j){
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k = 0 ; k<N;k++){
		System.out.print(arr[k] + " ");
		}System.out.println(); 
	}
}
