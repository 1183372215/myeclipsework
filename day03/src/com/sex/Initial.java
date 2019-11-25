package com.sex;

public class Initial {

	public static void main(String[] args) {
		Boy boy = new Boy("°Ö°Ö",21);
		boy.shout();
		
		Girl girl = new Girl("ÂèÂè",18);
		girl.marry(boy);
		
		Girl girl1 = new Girl("Ó¢Ì¨",19);
		System.out.println(girl1.getName());

	}

}
