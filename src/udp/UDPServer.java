package udp;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class UDPServer {

public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(1235);
		
		while(true) {
			
			
			new Thread(new UDPRun(ss.accept())).start();
			
			
		}
		
	}
}

