package Exo1;
import Exo1.Base;
import Exo1.GirlsSamePackage;
import Exo1.SamePackage;
import OtherPackage.OtherPackageBase;
import OtherPackage.GilsOtherPackage;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.method();
		System.out.println();
		GirlsSamePackage g = new GirlsSamePackage();
		g.method();
		System.out.println();
		SamePackage sp = new SamePackage();
		sp.method();
		System.out.println();
		OtherPackageBase oc = new OtherPackageBase();
		oc.method();
		System.out.println();
		GilsOtherPackage gc = new GilsOtherPackage();
		gc.method();
		System.out.println();
	}

}
