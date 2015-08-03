package com.weboniselab.HemantBonde.java.Assignment1;

public class Puppy extends Dog {
	private String s;	
	private int i;
	public Puppy() {
		System.out.println("In Puppy");		
	}
	public Puppy(String s) {
		// TODO Auto-generated constructor stub
		this();
		this.s=s;
		System.out.println("Created Puppy : "+s);
	}	
	public Puppy(String s,int i) {
		this(s);
		this.i=i;
		System.out.println("Puppy Id : "+ i);
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}
