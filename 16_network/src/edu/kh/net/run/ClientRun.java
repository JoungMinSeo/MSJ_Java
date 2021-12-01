package edu.kh.net.run;

import edu.kh.net.model.service.ClientService;

public class ClientRun {
	public static void main(String[] args) {
		
		// 클라이언트 시작
		new ClientService().clientStart();
		
	}
}
