package Flyweight;

import java.util.Random;

public class Cavalry implements Soldier {
	
	public static int objectCounter = 0;
	
	private int health;
	private int agility;
	private int power;
	private String name;
	private String weapon;
	
	public Cavalry() {
		name = "Süvari";
		weapon = "Kılıç";
		objectCounter++;
	}

	@Override
	public double calculateSoldierDamage() {
		// TODO Auto-generated method stub
		return ((health)+(agility*2)+(power*3))/11.0;
	}

	@Override
	public void assignRandomValues() {
		// TODO Auto-generated method stub
		Random random = new Random();
        health = random.nextInt(100)+80;
        agility = random.nextInt(100)+85;
        power = random.nextInt(100)+90;
	}
}