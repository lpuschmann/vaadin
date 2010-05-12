package org.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBundleActivator implements BundleActivator{

	//HelloWorldServiceBean helloBean;// = new HelloWorldServiceBean();
	
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bundle Activator start");
		
		
		
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bundle Activator stop");
	}
}
