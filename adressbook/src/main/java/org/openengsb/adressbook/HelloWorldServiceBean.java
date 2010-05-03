package org.openengsb.adressbook;

import org.openengsb.testservice.MyTestService;

public class HelloWorldServiceBean {
	public MyTestService test;

	public MyTestService getTest() {
		return test;
	}

	public void setTest(MyTestService test) {
		this.test = test;
	}
	
}
