package com.hrms.testscipts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.LIB.General;

public class Tc001 {
//public static void main(String[] args) {
	@Test
	
	public void Tc001test() {
		DOMConfigurator.configure("log4j.xml");
	General g=new General();
	g.openapplication();
	g.loginapplication();
	g.logoutapplication();
	g.closeapplication();
	
			

	}

}
