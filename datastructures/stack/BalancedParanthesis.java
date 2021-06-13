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
				char stChar = (Character) stack.pop();
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