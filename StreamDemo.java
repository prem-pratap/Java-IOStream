

public class StreamDemo {

	public static void main(String[] args) {
		String userhome=System.getProperty("user.home");
		String java_versison=System.getProperty("java.version");
		String java_home=System.getProperty("java.home");
		String classpath=System.getProperty("java.class.path");
		String osname=System.getProperty("os.name");
		String user_name=System.getProperty("user.name");
		String user_dir=System.getProperty("user.dir");
		System.out.println("The user's home directory is "+userhome);
		System.out.println("The java version  is "+java_versison);
		System.out.println("The java's home directory is "+java_home);
		System.out.println("The classpath is set to is "+classpath);
		System.out.println("The osname is "+osname);
		System.out.println("The user name is "+user_name);
		System.out.println("The working directory is "+user_dir);

	}

}
