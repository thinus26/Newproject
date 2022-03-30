package org.stepdef;


import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.Before;

public class HookClass extends BaseClass {
	
	@Before
	public void beforeScenario() {
          getDriver("chrome");
          lanchurl("https://adactinhotelapp.com/");
	}
	@After
	public void aferClass() {
		driver.close();
	}
	
	
	

}
