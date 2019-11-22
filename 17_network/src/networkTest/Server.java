package networkTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//1. ������ ��Ʈ��ȣ�� ���Ѵ�.
		int port = 8500;
		
		//2. ������ ��Ĺ ��ü�� �����Ѵ�
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			
			//3. Ŭ���̾�Ʈ�ʿ��� ���� ��û�� ���⸦ ��ٸ���.
			while(true) {
				//4. ���� ��û�� ���� ��û�� �����ϰ� 
				//�ش� Ŭ���̾�Ʈ�� ���� ���� ��ü�� �����Ѵ�.
				Socket client = server.accept();
				
				//5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ���� �����Ѵ�.
				InputStream input = client.getInputStream();
				OutputStream output = client.getOutputStream();
				
				//6. ������Ʈ���� ���� ������ ������Ų��.
				BufferedReader br = 
						new BufferedReader(
								new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				//7. ��Ʈ���� ���� �а� ���⸦ �Ѵ�.
				while(true) {
					String message = br.readLine();
					
					if(!message.equals("exit")) {
						System.out.println(client.getInetAddress().getHostAddress()
								+ "�� ���� �޼��� : " + message);
						pw.println("�޼��� �ޱ� ����");
						pw.flush();
					}else {
						System.out.println("��������");
						break;
					}
				}
				//8. ����� �����Ѵ�.
				br.close();
				pw.close();
				client.close();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}


















