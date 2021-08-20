package labprograms;

import java.util.Scanner;
class Stack{
	private int cap=3;
	int s[]=new int[cap];
	int top=-1;
	public void push(int ele) {
		if(top>=cap-1) {
			System.out.println("stack overflow");
		}
		else
		{
			s[++top]=ele;
		}
		
	}
	public void pop(){
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println("deleted element is"+s[top--]);
		}
	}
	public void display() {
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println("stack elements are");
			for(int i=top;i>=0;i--)
			{
				System.out.println(s[i]);
			}
		}
	}
	
	
	
			
	
}

public class firstprogramB {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Stack st=new Stack();
		for(;;) {
			System.out.println("1-push 2-pop 3-display");
			System.out.println("enter your choice");
			int ch=s.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to insert");
					int ele=s.nextInt();
					st.push(ele);
					break;
			case 2:st.pop();
			break;
			case 3:st.display();
			break;
			default:System.out.println("invlaid choice");
					
			}
			
		}

	}
	

}
