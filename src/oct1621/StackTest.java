package oct1621;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("S1");
		stack.push("S2");
		stack.push("S3");
		stack.push("S4");
		stack.push("S5");
		stack.push(1);
		stack.push(2);
		stack.push(4.56f);
		stack.push(8.28f);
		
		 System.out.println("stack "+ stack);
		 System.out.println("pop1  "+ stack.pop());
		 System.out.println("stack "+ stack);
		 System.out.println("pop2  "+ stack.pop());
		 System.out.println("peek  "+ stack.peek());
		 System.out.println("stack "+ stack);
	}

}
