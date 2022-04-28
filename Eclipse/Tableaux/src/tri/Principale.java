package tri;

import pile.Assert;
import pile.Stack;

public class Principale {

	public Principale() {
		// TODO Auto-generated constructor stub
	}
	static final int[] checkCapacities = { 1, 1, 2, 4, 4, 8, 8, 8, 8, 16 };
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		for (int i = 1; i < 10; i++) {
			
			stack.push(i);   
			stack.printData();
			Assert.check(stack.getCount() == i);
			Assert.check(stack.getCapacity() == Principale.checkCapacities[stack.getCount()]);
		}
		int res = 1;
		while (!stack.isEmpty()) {
			res *= stack.pop();
			Assert.check(stack.getCapacity() == Principale.checkCapacities[stack.getCount()]);
		}
		Assert.check(res == 362880); 
		Assert.check(stack. getCapacity() == 1); Assert.printInfo();
	}

}
