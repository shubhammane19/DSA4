import java.util.*;

class ParenthesisChecker{
	
	boolean validParenthesis(String str){
		
		Stack<Character> s = new Stack<Character>();
		for(int i = 0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			if(ch == '{' || ch == '(' || ch == '['){
				
				s.push(ch);
			}else{
				
				if(!s.empty()){
					
					char x = s.peek();
					if((x == '{' && ch == '}') || (x == '(' && ch == ')') || (x == '[' && ch == ']')){
						
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

class Main2{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Expression:");
		String str = sc.next();
		
		ParenthesisChecker obj = new ParenthesisChecker();
		
		boolean ret = obj.validParenthesis(str);
		
		if(ret){
			
			System.out.println("Balanced");
		}else{
			
			System.out.println("Not Balanced");
		}
	}
}