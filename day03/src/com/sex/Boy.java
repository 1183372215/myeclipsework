package com.sex;

public class Boy {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public Boy() {
	}
	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void marry(Girl girl) {
		System.out.println("��Ȣ��"+girl.getName());
	}
	public void shout() {
		if(this.age>=22) {
			System.out.println("����Ȣ");
		}
		else {
			System.out.println("�ٵȵȰɣ�");
		}
	}

	
}
