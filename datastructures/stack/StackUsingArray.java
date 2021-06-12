package stack;
/*
 * Stack implementation in array
 */
public class StackUsingArray {

	private static final int MAX_SIZE = 999;
	private int[] elements;

	public int[] getElements() {
		return elements;
	}

	private int top;

	public StackUsingArray() {
		elements = new int[MAX_SIZE];
		top = -1;
	}

	private void push(int number) {
		elements[++top] = number;
		System.out.println("Pushing " + elements[top] + " to stack");
	}

	private int pop() {
		if (top < 0) {
			System.out.println("No more elements. End of stack");
			return -1;
		} else {
			System.out.println("Popping " + elements[top] + " from stack");
			return elements[top--];
		}
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
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
	}

}
