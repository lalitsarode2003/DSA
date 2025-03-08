/*
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
