import java.net.*;
import java.io.*;

public class WhoIs {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("whois.internic.net", 43);
		InputStream input = sock.getInputStream();
		OutputStream output = sock.getOutputStream();
		String strng = "toyinaguda.com\n";
		byte buffer[] = strng.getBytes();
		output.write(buffer);
		int ch;
		while((ch = input.read()) != -1) {
			System.out.print((char) ch);
		}
		sock.close();
	}
	
}