package com.ahpu.edu;

public class Person {
	private int age;
	String name;

	public void setAge(int newAge) {
		age = newAge;
	}

	public int getAge() {
		return age;
	}


	public Person() {
		age = 18;
	}
	public Person(String n,int a) {
		name = n;
		age = a;
	}

}
