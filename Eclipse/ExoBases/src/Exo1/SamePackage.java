package Exo1;
import Exo1.Base;
public class SamePackage {

	public SamePackage() {
		// TODO Auto-generated constructor stub
	
			
		}
	public void method() {
		Base b = new Base();
		System.out.println("Autre classe dans le meme package");
		System.out.println("default "+b.defaultMember);
		System.out.println("pulic "+b.publicMember);
		//System.out.println("private "+this.privateMember);
		System.out.println("protected "+b.protectedMember);
	}
	
	

}
