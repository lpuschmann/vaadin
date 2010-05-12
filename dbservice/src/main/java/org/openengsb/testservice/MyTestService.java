package org.openengsb.testservice;

import java.util.List;

import org.openengsb.hibernate.Person;

public interface MyTestService {
	public String helloWorld();
	//public void delete(Person person);
	public void save(Person person);
	//public void update(Person person);
	//public List<Person> getAllPersons();
}
