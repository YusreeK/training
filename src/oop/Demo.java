package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Person -
		
		//Attributes, variables, adjectives, descriptors
		String name = "Yusree";
		String email = "yusree@testemail.com";
		String Phone = "27789041287";
		
		// Action, activity, behavior
		// System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
	
		// What if we wanted to do this for another person?
		String name1 = "wafieqah";
		String email1 = "wafieqah@testemail.com";
		String Phone1 = "27839232447";
		
		// Action, activity, behavior, 
		// System.out.println(name1 + " is walking");
		walking(name1);
		System.out.println(name1 + " is eating");
		
		// What about binding attributes and properties together?
	}
	
	// Enhance by adding functions to minimize code
	static void walking (String name){
		System.out.println(name + " is walking");
	}
}
