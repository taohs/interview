package Stack;

import java.util.Stack;

public class MyStack2 {
	private Stack<Integer> StackData;
	private Stack<Integer> StackMin;
	
	public MyStack2(){
		this.StackData = new Stack<Integer>();
		this.StackMin = new Stack<Integer>();
	}
	
	public void push(int newNum) {
		if (this.StackMin.isEmpty()) {
			this.StackMin.push(newNum);
		} else if (newNum < this.getMin()) {
			this.StackMin.push(newNum);
		} else {
			int newMin = this.StackMin.peek();
			this.StackMin.push(newMin);
		}
		this.StackData.push(newNum);	
	}
	
	public int pop() {
		if(this.StackData.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		this.StackMin.pop();
		return this.StackData.pop();
	}
	
	public int getMin() {
		if (this.StackMin.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		return this.StackMin.peek();
	}
	
	
}
