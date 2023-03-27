package ch19.lecture.p01network;

import java.io.*;
import java.net.*;
import java.util.*;

public class C05Client {
	public static void main(String[] args) {
		// ip주소
		String ip = "172.30.1.5";
		// prot 번호
		int port = 50500;
		while(true) {
			try (Socket socket = new Socket(ip, port);
					OutputStream os = socket.getOutputStream();
					BufferedOutputStream bos = new BufferedOutputStream(os);
					PrintStream ps = new PrintStream(bos)) {
				String input = "";
				String name  = "석운>";
				try (Scanner scan = new Scanner(System.in);) {
					while(true) {
						input = scan.nextLine();
						ps.println(name + input);
						ps.flush();
					}
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}
}
