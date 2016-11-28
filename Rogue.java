//Dawei Huang, Eric Zhang, Mohamed Tamara [Team RandomProjectGenerator]
//Due: 11/23/16
//Period 4 APCS w/ Mr. Brown Mykolyk
//HW#34 -- Ye Olde Role Playing Game, Unchained..

public class Rogue extends Character{

    int defaultDef = 30;
    double defaultAtk = 0.4;

	public void specialize() {
	defense -= 5;
	atkRtg += 0.1;
    }

    public void normalize() {
	defense = defaultDef;
	atkRtg = defaultAtk;
    }
	
    public Rogue() {
	name = "";
	maxHP = 150;
	HP = 150;
	strength = 125;
	defense = defaultDef;
	atkRtg = defaultAtk;
    }

    public Rogue(String newName) {
	this();
	name = newName;
    }
}
