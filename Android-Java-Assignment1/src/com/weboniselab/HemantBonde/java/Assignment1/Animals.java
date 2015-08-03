package com.weboniselab.HemantBonde.java.Assignment1;

public class Animals {
	private String str;
	private int num;

	public Animals() {
		System.out.println("******************************************************");
		System.out.println("You made -> ");
		String className = this.getClass().getName();
		System.out.println(className);
		System.out.println("\nIn Animals");
	}

	public Animals(String str) {
		this();
		this.str=str; 
		/*
		 * these private variables are made with a aim to have setter and getter later.
		 * */
		System.out.println("Created Animal : "+str);
	}

	public Animals(String str, int num) {
		// It will call the constructor with String argument
		this(str);
		this.num=num;
		System.out.println("Animal Id : " + num);
	}
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	protected String sound() {
		// TODO Auto-generated method stub
		return "Can bark or Mew or do something new.";
		
	}

	public String sound(int i) {
		// TODO Auto-generated method stub
		return "And maybe,It can also sing";
	}
}
