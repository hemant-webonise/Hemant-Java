package com.weboniselab.HemantBonde.java.Assignment1;

public class Puppy extends Dog {
	private String name;	
	private int id;
	public Puppy() {
		System.out.println("In Puppy");		
	}
	public Puppy(String s) {
		// TODO Auto-generated constructor stub
		this();
		this.name=s;
		System.out.println("Created Puppy : "+s);
	}	
	public Puppy(String s,int i) {
		this(s);
		this.id=i;
		System.out.println("Puppy Id : "+ i);
	}
	public String getS() {
		return name;
	}
	public void setS(String s) {
		this.name = s;
	}
	public int getI() {
		return id;
	}
	public void setI(int i) {
		this.id = i;
	}
}
