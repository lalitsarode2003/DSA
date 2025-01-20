/*Q. Prefix sum
    INPUT: arr:{-3,6,2,4,5,2,8,-9,3,1};
    OUTPUT: {-3,3,5,9,11,19,10,13,14};
*/

import java.util.*;

class PrefixArr{
    public static void main(String [] args){
    		int arr[] = new int []{-3,6,2,4,5,2,8,-9,3,1};
		int N = 10;
		int Q = 2;
		int PrSum [] = new int[N];
		PrSum[0] = arr[0];
		for(int i = 1;i<N;i++){
			PrSum[0] = arr[0];
			PrSum[i] = PrSum[i-1] + arr[i];
			System.out.print( PrSum[i] + " ");
		}System.out.println();
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<Q;i++){
			System.out.print("Enter Start index:");
			int StartInd = sc.nextInt();
			System.out.print("Enter End index(must be <" + N +"):");
			int EndInd = sc.nextInt();
				if(StartInd ==0){
					sum = PrSum[EndInd];
				}else{
					sum = PrSum[EndInd] - PrSum[StartInd-1];
				}System.out.println(sum);
		}System.out.println();
    }
    
}
