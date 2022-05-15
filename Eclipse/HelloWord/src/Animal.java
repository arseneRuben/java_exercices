interface hgood{
	public void doStuff();
}
public class Animal implements hgood{
	public  void doStuff() {
		System.out.print("a ");
	}
}

class Dog extends Animal {
	public   void doStuff() { // it's a redefinition,
		// not an override
		System.out.print("d ");
	}


		

}