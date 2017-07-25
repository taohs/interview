package Stack;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

public class Mystack2Test {

	Logger l = Logger.getLogger(MyStack1Test.class.getName());

	@Test
	public void test2() {
		
		MyStack2 ms = new MyStack2();
		
		int[] arr = {10, 3, 4, 5, 2, 1};
		
		for(int i : arr) {
			ms.push(i);
		}
		
		//ms.pop();
		
		
		l.info("the stackmin is :" +  ms.getMin());
		
	}
}
