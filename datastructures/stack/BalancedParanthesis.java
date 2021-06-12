package stack;

/*
 * Given a string containing opening and closing braces, 
 * Check if it represents a balanced expression or not 
 * 
 * {[{}{}]}[()], {{}{}}, []{}() are balanced expressions.
 * 
 * ()}[), {(}) are not balanced.
 *
 */
public class BalancedParanthesis {

	static void checkForBalancedParanthesis(String expression) {
		char[] expressionArr = expression.toCharArray();
		Stack stack = new Stack();
		for (char ch : expressionArr) {
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else if (ch == '}' || ch == ']' || ch == ')') {
				if (stack.isEmpty()) {
					System.out.println("Paranthesis are NOT balanced ...");
					return;
				}
				char stChar = stack.pop();
				if (stChar == '{' && ch == '}' || stChar == '[' && ch == ']' || stChar == '(' && ch == ')') {
					continue;
				} else {
					System.out.println("Paranthesis are NOT balanced ...");
					return;
				}
			}
		}
		System.out.println("Paranthesis are balanced ...");
	}

	public static void main(String[] args) {
		checkForBalancedParanthesis("{[{}{}]}[()]");
	}

}

class Stack {
	private static final int MAX_SIZE = 999;
	private char[] elements;

	public char[] getElements() {
		return elements;
	}

	private int top;

	public Stack() {
		elements = new char[MAX_SIZE];
		top = -1;
	}

	void push(char number) {
		elements[++top] = number;
		// System.out.println("Pushing " + elements[top] + " to stack");
	}

	char pop() {
		if (top < 0) {
			// System.out.println("No more elements. End of stack");
			return Character.MIN_VALUE;
		} else {
			// System.out.println("Popping " + elements[top] + " from stack");
			char ch = elements[top];
			elements[top] = 0;
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
}
