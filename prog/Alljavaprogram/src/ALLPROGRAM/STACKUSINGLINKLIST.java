package ALLPROGRAM;

public class STACKUSINGLINKLIST {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		static public class stack{
			static Node head=null;
			public boolean isempty() {
				return head==null;
			}
			public void push(int data) {
				Node newnode=new Node(data);
				if(isempty()) {
					head=newnode;
				}
				newnode.next=head;
				head=newnode;
			}
			public int pop() {
				if(isempty()) {
					return -1;
				}
				int top=head.data;
				head=head.next;
				return top;
			}
			public int peek() {
				if(isempty()) {
					return -1;
				}
				return head.data;
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stack s=new stack();
		s.push(99);
		s.push(999);
		
		System.out.println(s.peek());
		
	}
	}
}
