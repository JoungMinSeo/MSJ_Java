package edu.kh.net.run;

import edu.kh.net.model.service.ServerService;

public class ServerRun {
	public static void main(String[] args) {
		
		// ���� ����
		new ServerService().serverStart();
		
	}
}
