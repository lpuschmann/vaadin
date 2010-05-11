package org.openengsb.testservice.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.openengsb.hibernate.Person;
import org.openengsb.testservice.MyTestService;

public class MyTestServiceImpl extends HibernateDaoSupport implements MyTestService{
	
	public String helloWorld() {
		return "Hello World from Testservice";
	}
	
	@Override
	public void save(Person person) {
		
		getHibernateTemplate().saveOrUpdate(person);
	}
}
