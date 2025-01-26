/*Q. Write a program to return the count of pair of characters(i,j) such that :
     a] i<j.
     b] arr[i] = 'a'.
        arr[j] = 'g'.

	  INPUT: arr:{a,b,e,g,a,g}
	  OUTPUT: 3
*/
class CharArr{
	public static void main(String[] args){
		char arr[] = new char[]{'a','b','e','g','a','g'};
		int N = 6;
		int count = 0;
		for(int i = 0;i<N;i++){
			if(arr[i] == 'a'){ 
				for(int j=i+1;j<N;j++){
					if(arr[j] == 'g' & arr[i]<arr[j]){
						count++;
					}

				}
			}
		}System.out.println(count);
	}
}
