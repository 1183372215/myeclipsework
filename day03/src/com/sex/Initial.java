package com.sex;

public class Initial {

	public static void main(String[] args) {
		Boy boy = new Boy("�ְ�",21);
		boy.shout();
		
		Girl girl = new Girl("����",18);
		girl.marry(boy);
		
		Girl girl1 = new Girl("Ӣ̨",19);
		System.out.println(girl1.getName());

	}

}
