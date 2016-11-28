//Dawei Huang, Eric Zhang, Mohamed Tamara [Team RandomProjectGenerator]
//Due: 11/23/16
//Period 4 APCS w/ Mr. Brown Mykolyk
//HW#34 -- Ye Olde Role Playing Game, Unchained..

public abstract class Character {

    protected String name;
    protected int maxHP, HP, strength, defense, defaultDef;
    protected double atkRtg, defaultAtk;

    protected int level = 1;
    protected int experience = 0;

    public boolean isAlive() {
	return HP > 0;
    }

    public String getName() {
	return name;
    }
	
    public int getDefense() {
	return defense;
    }

    public void lowerHP(int damage) {
	HP -= damage;
    }

    public int attack(Character defender) {
	int damage = (int) ((strength*atkRtg) - defender.getDefense());
	defender.lowerHP(damage);
	return damage;
    }

    public void addExp(int amount) {
	experience += amount;
	int prevLvl = level;
	level = levelExp();
	if (level == prevLvl + 1) {
	    updateStats();
	    System.out.println("Level up!");
	    System.out.println("Max HP: "+maxHP/1.1+" -> "+maxHP);
	    System.out.println("Strength: "+strength/1.1+" -> "+strength);
	    System.out.println("Defense: "+defense/1.1+" -> "+defense);
	    System.out.println("Attack: "+atkRtg/1.1+" -> "+atkRtg);
	}
    }

    public int levelExp() {
	return (int) Math.sqrt(experience);
    }

    public void updateStats() {
	maxHP *= 1.1;
	HP = maxHP;
	strength *= 1.1;
	defense *= 1.1;
        atkRtg *= 1.1;
    }
	
    public abstract void specialize();

    public abstract void normalize();

    public String about(){
	String aboutStr = "";
	aboutStr += "Warrior: A hero with low health, high strength, low defense, and high attack \n";
	aboutStr += "Mage: A hero with low health, low strength, high defense, and high attack\n";
	aboutStr += "Rogue: A hero with high health, high strength, low defense, and low attack\n";
	aboutStr += "Scout: A hero with low health, high strength, high defense, and low attack\n";
	aboutStr += "Paladin: A hero with high health, low strength, high defense, and low attack\n";
	aboutStr += "Monster: A villan with medium health, medium strength, medium defense, and medium attack\n";
	return aboutStr;
    }
}

// high health: 150 low health: 100
// high strength:125 low strength: 75
// high defense: 50 low defense:30
// high attack:0.6  low attack: 0.4
