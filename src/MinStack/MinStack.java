package MinStack;

import java.util.ArrayList;

public class MinStack {

	ArrayList<Integer> stack = new ArrayList<Integer>();
	ArrayList<Integer> minStack = new ArrayList<Integer>();

	public void push(int x) {
		stack.add(x);
		if (minStack.size() == 0 || x < minStack.get(minStack.size() - 1)) {
			minStack.add(x);
		} else {
			minStack.add(minStack.get(minStack.size() - 1));
		}
	}

	public void pop() {
		if (stack.size() > 0) {
			stack.remove(stack.size() - 1);
			minStack.remove(minStack.size() - 1);
		}
	}

	public int top() {
		return stack.get(stack.size() - 1);
	}

	public int getMin() {
		if (minStack.size() > 0)
			return minStack.get(minStack.size() - 1);
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
