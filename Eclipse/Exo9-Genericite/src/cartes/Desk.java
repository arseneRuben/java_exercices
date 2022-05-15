package cartes;

public class Desk {

	private Stack<Cart> cartStack;
	
	//
	public Desk() {
		this.cartStack = new Stack<Cart>();
	}

	void addCard(Cart c) {
		this.cartStack.push(c);
	}
	
	void scramble() {
		this.cartStack.shuffleArray();
	}

	@Override
	public String toString() {
		return "Desk [cartStack=" + cartStack + "]";
	}
	
	
}
