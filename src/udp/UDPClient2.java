package udp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class UDPClient2 {
	
	public static void main(String[] args) throws IOException {

		Socket s = new Socket("127.0.0.1",1235);
		
		String input = "Siker!!";
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		pw.println(input);
		pw.flush();
		
		s.close();
	}

}
