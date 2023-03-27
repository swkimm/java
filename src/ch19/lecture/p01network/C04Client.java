package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C04Client {
	public static void main(String[] args) {

		// ip주소
		String ip = "172.30.1.5";
		// prot 번호
		int port = 50500;
		int i =0;
		while(true) {
			try (Socket socket = new Socket(ip, port);
					OutputStream os = socket.getOutputStream();
					BufferedOutputStream bos = new BufferedOutputStream(os);
					PrintStream ps = new PrintStream(bos)) {
				ps.println("hello server, i am client");
				
				ps.flush();
				System.out.println("클라이언트 종료 " + i);
				i++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
}
