package cartes;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desk desk = new Desk();
		
		for(Rank rank : Rank.values()) {
			for(Suit suit : Suit.values()) {
				desk.addCard(new Cart(rank, suit));
			}
		}
		System.out.println(desk);
		desk.scramble();
		System.out.println(desk);
	}

}
