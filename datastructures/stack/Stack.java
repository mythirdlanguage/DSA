package stack;

/*
 * Stack implementation in array
 */
public class Stack {

	private static final int MAX_SIZE = 999;
	private Object[] elements;
	private int top;

	public Stack() {
		elements = new Object[MAX_SIZE];
		top = -1;
	}

	void push(Object number) {
		elements[++top] = number;
		System.out.println("Pusing " + number + " to the stack");
	}

	Object pop() {
		if (top < 0) {
			return null;
		} else {
			Object ch = elements[top];
			elements[top] = 0;
			System.out.println("Popping " + ch + " from the stack");
			top--;
			return ch;
		}
	}

	boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public Object[] getElements() {
		return elements;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
	}

}
