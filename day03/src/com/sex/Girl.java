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
		System.out.println("��ޣ�"+boy.getName());
		boy.marry(this);
	}
	
	//�Ƚ����������С����������ǰ����󣻸�������ǰ����С
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
