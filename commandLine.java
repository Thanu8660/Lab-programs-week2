package week07;
public class commandLine {
	public static void main(String[] args) {
		if (args.length>0) {
			System.out.println("Java Buzzwords....");
			for(byte i=0;i<args.length;i++) {
				System.out.println((i+1)+"."+ args[i]);
			}
        }
        else {
        	System.out.println("NO COMMANDLINE ARGUMENT FOUND ");
        }
     }
}

