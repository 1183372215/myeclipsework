package com.sex;

public class Girl {

	private String name;
	private int age;
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
	public Girl() {
	}
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void marry(Boy boy) {
		System.out.println("想嫁："+boy.getName());
		boy.marry(this);
	}
	
	//比较两个对象大小，正数：当前对象大；负数：当前对象小
	public int compare(Girl girl) {
		if(this.age>girl.age) {
			return 1;
		}else if(this.age<girl.age) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}
