package org.openengsb.hibernate;

public class Person {
	private Long id;
	private String vorname;
	private String nachname;
	
	public Person(){
		
	}
	
	public Person(String vorname, String nachname){
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
}
