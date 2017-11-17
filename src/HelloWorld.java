
import java.io.*;

public class HelloWorld {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		HelloUser user = new HelloUser();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Geben sie den Usernamen ein: ");
		String eingabe = br.readLine();
		user.username = eingabe;
		
		
		System.out.println("Hello ASE2017 - How are you? :)");
		user.greetuser();
	}

}
