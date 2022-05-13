package MartialArtsFarmer;
import java.util.ArrayList;
import java.util.Scanner;

public class Code {

	int health, gold = 0, exp = 0, moveCap, moveAmt, difficulty = 1, damage, enemyAmt = 6;
	double harvestSkill = 1.0;
	Scanner input = new Scanner(System.in);
	
	public Code(int health, int gold, int exp, int difficulty, int damage, int enemyAmt) //enemy
	{
		this.health = health += difficulty;
		this.gold = gold;
		this.exp = exp;
		this.damage = damage += difficulty;
		this.difficulty = difficulty;
		this.enemyAmt = enemyAmt += difficulty;
	}
	
	public Code(int health, int gold, int exp, int damage, int moveCap, int moveAmt, double harvestSkill) //farmer
	{
		this.health = health;
		this.gold = gold;
		this.exp = exp;
		this.damage = damage;
		this.moveCap = moveCap;
		this.moveAmt = moveAmt;
		this.harvestSkill = harvestSkill;		
	}
		
	void skillTree()
	{
		System.out.println(exp);
		System.out.println("Which skill would you like to upgrade:");
		System.out.println("1: Health -550 exp");
		System.out.println("2: Damage -450 exp");
		System.out.println("3: Move Cap -850 exp");
		System.out.println("4: Harvest Skill -500 exp");
		int choice = input.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Your health has been increased by 5. Current Health: " +health+ " Currect Exp: " +exp);
				exp -= 550;
				health += 5;
			break;
			
			case 2:
				System.out.println("Your damage has been increased by 2. Current Damage: " +damage+ " Currect Exp: " +exp);
				exp -= 450;
				damage += 2;
			break;
			
			case 3:
				System.out.println("Your move cap has been increased by 1. Current Moves Cap: " +moveCap+ " Currect Exp: " +exp);
				exp -= 850;
				moveCap += 1;
			break;
			
			case 4:
				System.out.println("Your harvest skill has been increased by 0.5. Current Harvest Skill: " +harvestSkill+ " Currect Exp: " +exp);
				exp -= 500;
				harvestSkill += 0.5;
			break;	
		}
	}
	
	void shop()
	{
		System.out.println("Welcome to the shop! What would you like to buy today!");
		System.out.println("1.Health potion - 200G");
		int choice = input.nextInt();
		
		if (choice == 1)
		{
			gold -= 200;
			System.out.println("1 health potion has been added to your inventory. Current Gold: " +gold);
		}
		
	}
	
	void increaseDifficulty()
	{
		difficulty += 1;
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}

}

