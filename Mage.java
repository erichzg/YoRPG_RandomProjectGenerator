//Dawei Huang, Eric Zhang, Mohamed Tamara [Team RandomProjectGenerator]
//Due: 11/23/16
//Period 4 APCS w/ Mr. Brown Mykolyk
//HW#34 -- Ye Olde Role Playing Game, Unchained..

public class Mage extends Character{

    int defaultDef = 50;
    double defaultAtk = 0.6;

    public void specialize() {
	defense -= 5;
	atkRtg += 0.1;
    }

    public void normalize() {
	defense = defaultDef;
	atkRtg = defaultAtk;
    }
	
    public Mage() {
	name = "";
	maxHP = 100;
	HP = 100;
	strength = 75;
	defense = defaultDef;
	atkRtg = defaultAtk;
    }

    public Mage(String newName) {
	this();
	name = newName;
    }
}
