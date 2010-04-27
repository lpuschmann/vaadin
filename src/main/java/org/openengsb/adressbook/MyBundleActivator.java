package org.openengsb.adressbook;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class MyBundleActivator implements BundleActivator{

	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bundle Activator start");
		
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bundle Activator stop");
	}

}
