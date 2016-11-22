//Eric Zhang
//APCS1 pd4
//HW32 - Ye Olde Role Playing Game, Expanded
//2016-11-21


public class Character {

    protected String name;
    protected int HP, strength, defense, defaultDef;
    protected double atkRtg, defaultAtk;

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
	
	public void specialize() {
	defense -= 5;
	atkRtg += 0.1;
    }

    public void normalize() {
	defense = defaultDef;
	atkRtg = defaultAtk;
    }
	
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
