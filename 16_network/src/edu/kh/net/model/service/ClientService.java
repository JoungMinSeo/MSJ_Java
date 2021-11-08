package edu.kh.net.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientService {

	public void clientStart() {
		
		String serverIP = "127.0.0.1"; // Loop Back IP (�� ��ǻ�Ͱ� �� ��ǻ�͸� ��Ī �ϴ� IP)
		int port = 8500; // ������ ������ ��Ʈ ��ȣ�� ���ƾ� ��!
		
		Socket clientSocket = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			// 1) ������ IP�ּҿ� ������ ���� ��Ʈ ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ�� ���� ��ü ����
			clientSocket = new Socket(serverIP, port);
			// clientSocket�� ������ ServerSocket���� ����(����)�� ��û
			
			// 2) �������� ����� ��Ʈ�� ����
			if(clientSocket != null) { // �������� ������ �����Ǽ� ���� ��ü�� ������ ���
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
				// 3) ���� ��Ʈ���� ���� ���� ���
				br = new BufferedReader( new InputStreamReader(is) );
				pw = new PrintWriter(os);
				
				// 4) ��Ʈ���� ���� �а� ����
				
				// ���� -> Ŭ���̾�Ʈ�� ���� ���� �޼��� �о� ����
				String message = br.readLine();
				System.out.println(message);
				
				// ���� <- Ŭ���̾�Ʈ�� �޼��� ����(����)
				//pw.println("�Ƹ޸�ī�� �ϳ� �ּ���.");
				
				// Ŭ���̾�Ʈ�� �ۼ��� �޼��� ����
				Scanner sc = new Scanner(System.in);
				System.out.print("�Է� > ");
				pw.println( sc.nextLine() );
				
				pw.flush();
			}
			
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			// 5) ��� ����
			// ��Ʈ��, ���� �ݱ�
			
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(clientSocket != null) clientSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	
}
