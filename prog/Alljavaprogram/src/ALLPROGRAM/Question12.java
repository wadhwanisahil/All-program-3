package ALLPROGRAM;
//push at bottom
import java.util.*;

public class Question12 {
	//push at bottom
	public static void pushatbottom(Stack<Integer> s,int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		pushatbottom(s,data);
		s.push(top);}
	//reverse a string using stack
	public static String reversestring(String str) {
		Stack<Character> ch=new Stack<>();
int idx=0;
while(idx<str.length()) {
	ch.push(str.charAt(idx));
	idx++;
}
StringBuilder sc=new StringBuilder("");
while(!ch.isEmpty()) {
	char curr=ch.pop();
	sc.append(curr);
}
return sc.toString();
	}
	//reverse a stack and we also using push at bottom function 
	public static void reversestack(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top=s.pop();
		reversestack(s);
		pushatbottom(s,top);
	}
	public static void printstack(Stack<Integer> s) {
		while(!s.isEmpty()) {
		System.out.println(s.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer > sc=new Stack<>();
		//reverse stack
//		sc.push(1);
//		sc.push(2);
//		sc.push(3);
//	
//		reversestack(sc);
//		printstack(sc);
//		
		//reverse a string using stack
//String sc="helloworld";
//String result=reversestring(sc);
//System.out.println(result);
		//push at bottom problem in stack
//Stack<Integer> s=new Stack<>();
//s.push(5);
//s.push(6);
//s.push(8);
//pushatbottom(s,4);
//while(!s.isEmpty()) {
//	System.out.println(s.pop());
//}
//	
	
	}

}
