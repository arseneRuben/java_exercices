package a;

public class Etudiant {
	String name;
	int num;
	int year;
	public Etudiant(String name, int num, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.num = num;
		this.year = age;
	}

	public String toString() {
		String result = this.name + " (no "+ this.num + ", "+ this.year + " ans)" ;
		return result;
	}
}
