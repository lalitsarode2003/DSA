/* Insertion Sort*/

class Insertion{
	public static void main(String[]args){
		int arr[] = new int[]{8,3,1,7,5,4,2};
		for(int i = 1;i<arr.length;i++){
			System.out.println("i:"+i);
			int j = i-1;
			System.out.println("j:"+j);

			int element = arr[i];
			while(j>=0 && arr[j]>element){
				arr[j+1] = arr[j];
				System.out.println("While j:"+j);
				j--;
			}
			arr[j+1] = element;
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
}
