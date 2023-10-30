package com.hrms.testscipts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.LIB.General;


public class Tc002 {

//public static void main(String[] args) throws Exception {
          
   @Test      
        public   void Tc002test() throws Exception {
		DOMConfigurator.configure("log4j.xml");

          
		General g=new General();
		g.openapplication();
		g.loginapplication();
		g.enterframe();
		g.addemployee();
		g.exitframe();
		g.logoutapplication();
		g.closeapplication();
		
  
   

	}

}
