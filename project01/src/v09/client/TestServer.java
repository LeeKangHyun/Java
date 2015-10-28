package v09.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		Socket socket = null;
		BufferedReader in = null;
		PrintStream out = null;
		String message = null;
		
		while (true) {
			System.out.println("클라이언트의 연결을 기다림");
			socket = ss.accept();
			System.out.println("클라이언트 연결됨");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintStream(socket.getOutputStream());
			
			message = in.readLine();
			out.println("aaaaaaa1");
			out.println("aaaaaaa2");
			out.println("aaaaaaa3");
			out.println("aaaaaaa4");
			out.println();
			
			in.close();
			out.close();
			socket.close();
			System.out.println("클라이언트에게 응답함");
		}
	
	}
}
