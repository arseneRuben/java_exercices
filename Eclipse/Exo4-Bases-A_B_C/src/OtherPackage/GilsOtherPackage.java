package OtherPackage;

import Exo1.Base;

public class GilsOtherPackage extends Base {
	public void method() {
		Base b = new Base();
		System.out.println("Fille dans un autre package");
	//	System.out.println("default "+b.defaultMember);
		System.out.println("pulic "+b.publicMember);
	//	System.out.println("private "+this.privateMember);
	//	System.out.println("protected "+b.protectedMember);
	}
}
