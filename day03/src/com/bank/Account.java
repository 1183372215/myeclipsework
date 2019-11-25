package com.bank;

public class Account {
	private int id;
	private double balance;
	private double annualinterestRate;
	public Account(int id, double balance, double annualinterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualinterestRate = annualinterestRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualinterestRate() {
		return annualinterestRate;
	}
	public void setAnnualinterestRate(double annualinterestRate) {
		this.annualinterestRate = annualinterestRate;
	}
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("余额不足，取款失败");
            return;		
		}
		balance -=amount;
		System.out.println("取款："+amount);
	}
	public void deposite(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("存钱："+amount);
		}
		
	}

}
