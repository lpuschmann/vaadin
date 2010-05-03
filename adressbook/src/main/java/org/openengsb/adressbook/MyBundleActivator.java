package org.openengsb.adressbook;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.openengsb.adressbook.HelloWorldServiceBean;
import org.openengsb.testservice.MyTestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBundleActivator implements BundleActivator{

	HelloWorldServiceBean helloBean = new HelloWorldServiceBean();
	
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bundle Activator start");
		ServiceReference webContext = context.getServiceReference("org.springframework.context.ApplicationContext");
		ApplicationContext appContext = (ApplicationContext) context.getService(webContext);
		helloBean.setTest((MyTestService) appContext.getBean("testService"));
		if(helloBean!=null){
			System.out.println(helloBean.test.helloWorld());
		}else{
			System.out.println("null");
		}
		
		
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bundle Activator stop");
	}

	public HelloWorldServiceBean getHelloBean() {
		return helloBean;
	}

	public void setHelloBean(HelloWorldServiceBean helloBean) {
		this.helloBean = helloBean;
	}

}
