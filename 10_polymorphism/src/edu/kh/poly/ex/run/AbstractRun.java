package edu.kh.poly.ex.run;

import edu.kh.poly.ex.model.service.AbstractService;

public class AbstractRun {
	public static void main(String[] args) {
		AbstractService service = new AbstractService();
		service.example1();
	}
}
