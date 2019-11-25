package com.ahpu.edu;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
//		p.setAge(3);
		int newAge = p.getAge();
		System.out.println("ÄêÁä£º"+newAge);
		
		Person p1 = new Person("Tom",21);
		System.out.println(p1.name+","+p1.getAge());
	}

}
