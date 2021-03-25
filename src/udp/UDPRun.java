package udp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.security.Timestamp;
import java.util.Date;


public class UDPRun implements Runnable {
	private Socket s;
	
	public UDPRun(Socket s) {
		
		this.s = s;
		
	}
	
	/*public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s = new Socket("127.0.0.1",1234);
		
		String input = "asd2";
		System.out.println("az input: "+input);
		
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		pw.println(input);
		pw.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String output = br.readLine();
		
		System.out.println("Az output: "+output);
		
		pw.close();
		br.close();
		s.close();
}*/
	
	
	
	
	@Override
	public void run() {
		
		
		
		
		BufferedReader br;
		try {
			Date date = new Date();
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String input = br.readLine();
		
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			pw.println(input);
			System.out.println(input);
			BufferedWriter writer = new BufferedWriter(new FileWriter("recieved.txt",true));
			writer.newLine();
			writer.write(input+ "" +new java.sql.Timestamp(System.currentTimeMillis()));
			
			
			writer.close();
			pw.flush();
			pw.close();
			br.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}