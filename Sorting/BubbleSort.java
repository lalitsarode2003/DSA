/* Bubble Sort */
class BubbleSort{
	void bubble(int arr[]){
		boolean swapped;
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			swapped = false;
			for(int j = 0;j<arr.length-i-1;j++){
				count++;
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(swapped == false){
				break;
			}
		}
		System.out.println(count);
	}
	public static void main(String[]args){
		int arr[] = new int[]{7,3,9,4,2,5,6};
		BubbleSort obj = new BubbleSort();
		obj.bubble(arr);

		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
