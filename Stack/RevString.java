/* Reverse a String using a Stack
*/

import java.util.*;

class StringRev{

	String revString(String str){
		char stackArr[] = new char[str.length()];
		Stack<Character> s = new Stack<Character>();
		for(int i = 0; i < str.length(); i++){

			s.push(str.charAt(i));
		}
		int i = 0;
		while(!s.empty()){
			stackArr[i] = s.pop();
			i++;
		}
		return new String(stackArr);	// if returned only stackArr then we get incompatible type error because we are taking String as return type and returning character array therefore we retun string object so that it can be used in one of the String constructor which has character Array as its parameter.  
	}
	
}
class Client{
	public static void main(String [] lalit){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String str = sc.next();

		StringRev obj = new StringRev();

		String rev = obj.revString(str); // String as return type

		System.out.println(rev);
	}
}
