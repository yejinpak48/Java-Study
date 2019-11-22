package networkTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		//1. ������ IP�ּҿ� ������ ���� port��ȣ�� �Ű������� �Ͽ� 
		//Ŭ���̾�Ʈ�� ���� ��ü�� �����Ѵ�.
		int port = 8500;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			String serverIP = InetAddress.getLocalHost().getHostName();
			
			Socket socket = new Socket(serverIP, port);
			
			//2. �������� ����� ��Ʈ���� �����Ѵ�.
			if(socket != null) {
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
				//3. ������Ʈ���� �ٿ� ������ �����Ѵ�.
				br = new BufferedReader(new InputStreamReader(input));
				pw = new PrintWriter(output);
				
				//4. ��Ʈ���� ���� �а� ���⸦ �Ѵ�.
				Scanner sc = new Scanner(System.in);
				
				do {
					System.out.print("��ȭ �Է� : ");
					String message = sc.nextLine();
					
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")) {
						break;
					}
					
					String recieveMessage = br.readLine();
					System.out.println(recieveMessage);
				}while(true);
				
				//5. ����� �����Ѵ�.
				br.close();
				pw.close();
				socket.close();
				
			}
		
		
		
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}












