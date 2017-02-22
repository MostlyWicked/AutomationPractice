package googleSearchPackage;

public class MyAssert {
	
	/**
	 * 
	 * @param check - if false, produce error message and exit.
	 * @param errmsg - error message.
	 */
	public static void myAssert(boolean check, String errmsg){
		if (!check){
			System.err.println(errmsg);
			System.exit(-1);
		}
	}

}
