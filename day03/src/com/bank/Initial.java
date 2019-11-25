package com.bank;

public class Initial {
	public static void main(String[] args) {
		Customer c = new Customer("Jane","Simth");
		Account a = new Account(0001,2000,0.0123);
		c.setAccount(a);
		c.getAccount().deposite(100);
		c.getAccount().withdraw(960);
		c.getAccount().withdraw(2000);
		System.out.println(c.getFirstname()+" "+c.getLastname()+ " µÄÓà¶î»¹ÓÐ£º"
		+c.getAccount().getBalance());
	}

}
