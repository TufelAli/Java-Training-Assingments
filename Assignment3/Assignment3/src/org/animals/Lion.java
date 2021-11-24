package org.animals;

public class Lion {
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
		System.out.println("Non Vegetarian");
	}
	public void canClimb() {
		System.out.println("Can Climb");
	}
	
	public void sound() {
		System.out.println("Roar");
	}
	
	public void Details() {
		color="Brown";
		weight=70;
		age=20;
		System.out.println("Color :"+color+" Weight :"+weight+" Age: "+age);
		isVegetarian();
		canClimb();
		sound();
	}
	
	
}
