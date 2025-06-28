// Valid Parenthesis or Parenthesis Checker

import java.util.*;

class CheckParenthesis{
	boolean validParenthesis(String str){
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i<str.length();i++){
			char ch = str.charAt(i);

			if(ch == '{' || ch == '[' || ch == '('){
				s.push(ch);

			}else{
				if(!s.empty()){
					char top = s.peek();
					if(top == '{' && ch == '}' || top =='[' && ch == ']'|| top == '(' && ch == ')' ){
						s.pop();
					}else{
						return false;
					}

				}else{
					return false;
				}
			}
		}
		if(s.empty()){
			return true;
		}else{
			return false;
		}
	}
}
class Client{
	public static void main(String [] lalit){
		
		Scanner sc = new Scanner(System.in);
	   	System.out.println("Enter the Expression");
      	      	String str = sc.next(); 	

		CheckParenthesis obj = new CheckParenthesis();
		boolean ret = obj.validParenthesis(str);

		if(ret){
			System.out.println("Balanced");
		}else{
			System.out.println("Not-balanced");
		}
	}
}
