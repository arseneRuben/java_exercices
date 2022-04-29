package Exo1;

public class Base {
	int defaultMember;
	public int publicMember;
	private int privateMember;
	protected int protectedMember;
	
	public void method() {
		System.out.println("Classe de base elle meme");
		System.out.println("default "+defaultMember);
		System.out.println("pulic "+publicMember);
		System.out.println("private "+privateMember);
		System.out.println("protected "+protectedMember);
	}
}

