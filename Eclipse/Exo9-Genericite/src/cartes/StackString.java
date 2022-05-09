package cartes;

public class StackString {

	
	public StackString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<String> pile = new Stack() ;
		 pile.push("Winny Mandela");
		 pile.push("Thomas Sankara");
		 pile.push("Abdel Aziz Bouteflika");
		 pile.printData();
		 System.out.println(pile.pop());
	}

}
