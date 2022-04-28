package Exo1;

public class GirlsSamePackage extends Base {

	public GirlsSamePackage() {
		// TODO Auto-generated constructor stub
	}
	
	public void method() {
		System.out.println("Fille du mme package");
		System.out.println("default "+this.defaultMember);
		System.out.println("pulic "+this.publicMember);
	//	System.out.println("private "+this.privateMember);
		System.out.println("protected "+this.protectedMember);
	}

}
