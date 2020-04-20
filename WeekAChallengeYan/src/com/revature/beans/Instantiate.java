package com.revature.beans;

public class Instantiate {
	
	private String name;
	private int age;
	
	public Instantiate (String name, int age) {

	this.name=name;
	this.age=age;

		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "I have instantiated a name " + name + " !Her age is " + age +" years old!";
	}

}
