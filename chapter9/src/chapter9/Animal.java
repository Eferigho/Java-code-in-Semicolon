/**
 * 
 */
package chapter9;

/**
 * @author user
 *
 */
public class Animal {
	private String name;
	private double weigth;
	private Color color;
	protected static int lifeSpan;
	
	
	public Animal() {
		
	}
	
	public Animal(String animalName) {
		name = animalName;
	}
	
	public Animal(String animalName, double animalWeigth) {
		name = animalName;
		weigth = animalWeigth;
		
	}
	
	public Animal(String animalName, double animalWeigth, Color color) {
		name = animalName;
		weigth = animalWeigth;
		this.color = color;
	}
	
	
	
	
	public void move() {
		System.out.println("This animal is on the move...");
	}
	
	public void sound() {
		System.out.println("This animal is sounding...");
	}
	
	public static int getLifeSpan() {
		return lifeSpan;
	}
	
	public static void setLifeSpan(int span) {
		lifeSpan = span;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weigth;
	}
	public void setWeight(double weight) {
		this.weigth = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
