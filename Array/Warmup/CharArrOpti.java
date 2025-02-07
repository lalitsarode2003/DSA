/*Q. Write a program to return the count of pair of characters(i,j) such that :
     a] i<j.
     b] arr[i] = 'a'.
        arr[j] = 'g'.

	  INPUT: arr:{a,b,e,g,a,g}
	  OUTPUT: 3
*/
class CharOpti{
	public static void main(String[] args){
		char arr[] = new char[]{'a','b','e','g','a','g'};
		int N = arr.length;
		int count = 0;
		int pair = 0;
		for(int i = 0; i<N;i++){
			if (arr[i] =='a'){
				count++;
			}else if(arr[i] == 'g'){
				pair+= count;
			}
		}System.out.println(pair);


	}
}
