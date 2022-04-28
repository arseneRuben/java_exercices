package pile;

public class Assert {
	
	static final Thread thisThread = Thread.currentThread();
	static int checkCount = 0, checkFail = 0;
	public static void check(Boolean expr) {
		Assert.checkCount++;
		if (!expr) {
			StackTraceElement ste = Assert.thisThread.getStackTrace()[2];
			System.out.printf("*** Check failed at %s (%s) ***\n", ste.getClassName()+"."+ste.getMethodName(), 					ste.getFileName()+":"+ste.getLineNumber());
			Assert.checkFail ++;
		}
	}
	public static void printInfo() {
		System.out.printf("(%d tests done)\n(%d failed)\n", Assert.checkCount, Assert.checkFail);
	}

	public Assert() {
		// TODO Auto-generated constructor stub
	}

}
