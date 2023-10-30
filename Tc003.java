package com.hrms.testscipts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.LIB.General;

public class Tc003 {

	//public static void main(String[] args) throws Exception {
	@Test
	public void Tc003test() {
		DOMConfigurator.configure("log4j.xml");

		General g=new General();
		g.openapplication();
		g.loginapplication();
		g.enterframe();
		g.delemployee();
	//	g.addemployee();
		g.exitframe();
		g.logoutapplication();
		g.closeapplication();
		


	}

}
