/* Bubble Sort */
class BubbleSort{
	boolean swapped;
	int count = 0;
	void bubble(int arr[],int n){
			
		if(n == 1){
			return;
		}
		swapped = false;
		for(int j = 0;j<n-1;j++){
			count++;
			if(arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapped = true;
			}
		}//System.out.println(count);
		if(swapped == false)
			return;
		bubble(arr,n-1);
		//System.out.println(count);
	}
	public static void main(String[]args){
		int arr[] = new int[]{7,3,9,4,2,5,6};
		BubbleSort obj = new BubbleSort();
		obj.bubble(arr,arr.length);
	
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(obj.count);
	}
}
