//Dawei Huang, Eric Zhang, Mohamed Tamara [Team RandomProjectGenerator]
//Due: 11/23/16
//Period 4 APCS w/ Mr. Brown Mykolyk
//HW#34 -- Ye Olde Role Playing Game, Unchained..

public class Warrior extends Character{

    int defaultDef = 30;
    double defaultAtk = 0.6;
    double chanceOfRandomDeath = 0.1;

    public void specialize() {
	defense -= 5;
	atkRtg += 0.1;
    }

    public void normalize() {
	defense = defaultDef;
	atkRtg = defaultAtk;
    }
	
    public Warrior() {
	name = "";
	maxHP = 100;
	HP = 100;
	strength = 125;
	defense = defaultDef;
	atkRtg = defaultAtk;
    }

    public Warrior(String newName) {
	this();
	name = newName;
    }

}
