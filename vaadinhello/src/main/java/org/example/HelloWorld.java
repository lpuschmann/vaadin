package org.example;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.context.WebApplicationContext;

@Configurable(preConstruction = true)
public class HelloWorld extends Application {

    @Autowired
    private MyBean myBean;
    
    private Window mainWindow;

    @Override
    public void init() {
        mainWindow = new Window("Vaadin+Spring Demo");
        if(myBean != null){
        	mainWindow.addComponent(new Label("myBean info: " + this.myBean.info()));
        }else{
        	printAppContext();
        }
        
        setMainWindow(mainWindow);
    }
    
    public void printAppContext(){
    	mainWindow.addComponent(new Label("your Bean is null"));
    }

	public MyBean getMyBean() {
		return myBean;
	}

	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}
}

