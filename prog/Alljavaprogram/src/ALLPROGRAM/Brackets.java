package ALLPROGRAM;
import java.util.*;
public class Brackets {
	public static boolean brack(String str) {
		Stack<Character> s=new Stack<>();
		for(int i=0;i<=str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='('||ch=='{'||ch=='[') {
			s.push(ch);
		}else
			if(s.isEmpty()) {
				return false;
			}
		if((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']')){
			s.pop();
		}
		else
			return false;
		}
		if(s.isEmpty()) {
			return true;
		}
		else
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String sc="()";
 
 System.out.println(brack(sc));
	}

}
