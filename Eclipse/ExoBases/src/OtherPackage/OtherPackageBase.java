package OtherPackage;
import Exo1.Base;
public class OtherPackageBase {

	public OtherPackageBase() {
		// TODO Auto-generated constructor stub
	}
	
	public void method() {
		Base b = new Base();
		System.out.println("Une autre classe dans un autre package");
		
		//System.out.println(b.defaultMember);
		System.out.println("pulic "+ b.publicMember);
		//System.out.println(b.privateMember);
		//System.out.println(b.protectedMember);
	}

}
