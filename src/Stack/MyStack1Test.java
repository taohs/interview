package Stack;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

public class MyStack1Test {
	
	Logger l = Logger.getLogger(MyStack1Test.class.getName());

	@Test
	public void test() {
		
		MyStack1 ms = new MyStack1();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i : arr) {
			ms.push(i);
		}
		
		l.info("the stackmin is :" +  ms.getMin());
		
	}
	
	@Test
	public void test1() {
		
		MyStack1 ms = new MyStack1();
		
		int[] arr = {10, 3, 4, 5, 2,1};
		
		for(int i : arr) {
			ms.push(i);
		}
		
		ms.pop();
		ms.pop();
		
		l.info("the stackmin is :" +  ms.getMin());
		
	}
	
	


}
