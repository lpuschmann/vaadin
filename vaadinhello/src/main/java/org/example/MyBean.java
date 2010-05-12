package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Required;

/**
 * Example of a Spring bean.
 */
public class MyBean implements BeanFactoryAware {

    private String name;
    private BeanFactory beanFactory;

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public String info() {
        return "id=" + toString() + " name=" + this.name + " beanFactory=" + this.beanFactory;
    }
}

