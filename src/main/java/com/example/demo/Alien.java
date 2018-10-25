package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Alien {

	private int id;
	private String name;
	private String tech;
	@Autowired  // THIs annotation searches the relation bean by type
	@Qualifier("laptop") // THis annotation searches the relation bean by name("laptop is the name in this case") 
	private Laptop laptop;
	
	
	public int getId() {
		return id;
	}
	
	public Alien() {
		super();
		System.out.println("Object created");
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void show() {
		this.laptop.compile();
		System.out.println("Done");
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
}
