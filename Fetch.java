import java.net.InetAddress;
import java.net.UnknownHostException;
public class Fetch {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip;
		String hostname;
		ip = InetAddress.getLocalHost();
		hostname = ip.getHostName();
		System.out.println(System.getProperty("user.name")+"@"+hostname);
		System.out.println("OS: "+System.getProperty("os.name"));
		System.out.println("Version: "+System.getProperty("os.version"));
		System.out.println("Arch: "+System.getProperty("os.arch"));
	}

}
