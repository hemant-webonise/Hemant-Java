package com.weboniselab.HemantBonde.java.Assignment1;

public class Dog extends Animals{
	private int i;	
	private String s;
	public Dog(){
		super();
		System.out.println("In Dog");
	}
	public Dog(String s) {
		// TODO Auto-generated constructor stub
		this();
		this.s=s;
		System.out.println("Created Dog : "+s);
	}	
	public Dog(String s,int i) {
		this(s);
		this.i=i;
		System.out.println("Dog ID : "+i);
	}
	protected String sound() {
		// TODO Auto-generated method stub
		return "Can bark!";
		
	}
	
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}

}
