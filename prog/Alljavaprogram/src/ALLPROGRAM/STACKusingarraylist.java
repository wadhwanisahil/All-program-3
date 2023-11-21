package ALLPROGRAM;
import java.util.ArrayList;
public class STACKusingarraylist {
	static class Stack{
		static ArrayList<Integer> list=new ArrayList<>();
		static boolean isempty() {
			return list.size()==0;
		}
		//push
		public void push(int data) {
			list.add(data);
		}
		public int pop(){
			if(isempty()) {
				return -1;}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		public int peek() {
			if(isempty()) {
				return -1;
			}
			return list.get(list.size()-1); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(2);
		s.push(4);
		s.pop();

	}

}
