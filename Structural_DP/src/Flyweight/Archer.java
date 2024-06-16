package Flyweight;

import java.util.Random;

public class Archer implements Soldier {

	public static int objectCounter = 0;

    private int health;
    private int agility;
    private int power;
    private String name;
    private String weapon;

    public Archer(){
        name = "Okçu";
        weapon = "Ok";
        objectCounter++;
    }
	
	@Override
	public double calculateSoldierDamage() {
		// TODO Auto-generated method stub
		return ((health*2)+(agility*3)+(power*2))/12.0;
	}

	@Override
	public void assignRandomValues() {
		// TODO Auto-generated method stub
		Random random = new Random();
        health = random.nextInt(100)+80;
        agility = random.nextInt(100)+90;
        power = random.nextInt(100)+85;
	}

}
