//Dawei Huang, Eric Zhang, Mohamed Tamara [Team RandomProjectGenerator]
//Due: 11/23/16
//Period 4 APCS w/ Mr. Brown Mykolyk
//HW#34 -- Ye Olde Role Playing Game, Unchained..

public class Paladin extends Character{

    int defaultDef = 150;
    double defaultAtk = 0.1;

	public void specialize() {
	defense -= 5;
	atkRtg += 0.1;
    }

    public void normalize() {
	defense = defaultDef;
	atkRtg = defaultAtk;
    }
	
    public Paladin() {
	name = "";
	maxHP = 250;
	HP = 250;
	strength = 125;
	defense = defaultDef;
	atkRtg = defaultAtk;
    }

    public Paladin(String newName) {
	this();
	name = newName;
    }
}
