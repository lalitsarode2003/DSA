/* Q. Write a programe to return the count of pairs (i,j) such that arr[i]+arr[j]=k.
NOTE: i =! j
    arr: {3,5,2,1,-3,7,8,11,15,6,13}
    k = 10;
*/
class ArrPairs {
    public static void main(String[] args) {
        int arr[] = new int[]{3,5,2,1,-3,7,8,11,15,6,13};
        int k =10;
        int count = 0;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k && i != j ){
                    count++;
                }
            }
        }System.out.println(count*2);
        System.out.println();
    }
}
