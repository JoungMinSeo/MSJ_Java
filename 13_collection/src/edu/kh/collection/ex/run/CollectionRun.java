package edu.kh.collection.ex.run;

import edu.kh.collection.ex.model.service.ListService;
import edu.kh.collection.ex.model.service.MapService;
import edu.kh.collection.ex.model.service.SetService;
import edu.kh.collection.ex.model.service.StudentManagementService;

public class CollectionRun {
	public static void main(String[] args) {
		ListService lService = new ListService();
//		lService.example1();
//		lService.example2();
		
		
		StudentManagementService stdService = new StudentManagementService();
//		stdService.displayMenu();
		
		SetService sService = new SetService();
		//sService.example1();
//		sService.example2();
//		sService.lotto1();
//		sService.lotto2();
//		sService.lotto3();
		
		
		MapService mService = new MapService();
//		mService.example1();
		mService.example2();
		
		
		
		
	}
}
