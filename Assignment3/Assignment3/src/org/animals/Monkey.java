package org.animals;

public class Monkey {
	private String color;
	private int weight;
	private int age;
	
	public void setColor(String color) {
		this.color=color;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public void isVegetarian() {
		System.out.println("Vegetarian");
	}
	public void canClimb() {
		System.out.println("Can Climb");
	}
	
	public void sound() {
		System.out.println("Whooping");
	}
	
	public void Details() {
		color="Brown";
		weight=30;
		age=10;
		System.out.println("Color :"+color+" Weight :"+weight+" Age: "+age);
		isVegetarian();
		canClimb();
		sound();
	}
	
	
}
