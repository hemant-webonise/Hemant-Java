package com.weboniselab.HemantBonde.java.Assignment1;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder concept = new StringBuilder("-------------------------------------------------");
		concept.append("\nWe prefer not using + to concate instead StringBuilder and append() should be used.");

		Animals doggy = new Dog("Rooky", 1);
		System.out.println(doggy.sound());
		
		Animals peacock = new Animals("Peacock", 2);
		peacock.getClass();
		/*Method overriding-using method sound()*/
		System.out.println(peacock.sound());
		/*Method overloading- using method sound(2) with a parameter in it.*/
		System.out.println(peacock.sound(2));
		
		
		Puppy pups = new Puppy("Brono",1);
		/*Method overriding-using method sound()*/
		System.out.println(pups.sound());
		
		Animals kitty = new Kitten();
		/*Method overriding-using method sound()*/
		System.out.println(kitty.sound());

		try {
			/* Tried casting of a parent to child-class */
			/*Kitten test = new Animals();-will cause a Compile time error*/
			Kitten test = (Kitten) new Animals();
			System.out.println(test.sound());
			
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			System.out.println("Class-cast exception - Animal is a parent of Kitten");
		}
		try {
			/*Use of throw*/
            throw new TestExceptions("Exceptions work!");
        }
        catch( Exception a1 ) {
            System.out.println("Working Status: " + a1.getMessage() );
        }

		System.out.println(concept);

	}

}
