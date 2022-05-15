
public class Hello {

	Integer i;

	public Hello(Integer i) {
		
		this.i = i;
	}
	
	@Override
	public String toString() {
		return "Hello [i=" + i + "]";
	}

	public static void test() {
		Hello v = new Hello(4);
		System.out.println(v);
	}
	
	public static void main(String[] args) {
		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (int x = 0; x < a.length; x++)
			System.out.println(a[x] instanceof hgood); ; // invoke the static method
	}
	

}

class Good extends Hello {
	public Good() {
		super(4);
	}
}