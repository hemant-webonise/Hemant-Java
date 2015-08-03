package com.weboniselab.HemantBonde.java.Assignment1;

public class Dog extends Animals{
	private int id;	
	private String name;
	public Dog(){
		super();
		System.out.println("In Dog");
	}
	public Dog(String s) {
		// TODO Auto-generated constructor stub
		this();
		this.name=s;
		System.out.println("Created Dog : "+s);
	}	
	public Dog(String s,int i) {
		this(s);
		this.id=i;
		System.out.println("Dog ID : "+i);
	}
	protected String sound() {
		// TODO Auto-generated method stub
		return "Can bark!";
		
	}
	
	
	public int getI() {
		return id;
	}
	public void setI(int i) {
		this.id = i;
	}
	public String getS() {
		return name;
	}
	public void setS(String s) {
		this.name = s;
	}

}
