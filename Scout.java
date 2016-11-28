//Dawei Huang, Eric Zhang, Mohamed Tamara [Team RandomProjectGenerator]
//Due: 11/23/16
//Period 4 APCS w/ Mr. Brown Mykolyk
//HW#34 -- Ye Olde Role Playing Game, Unchained..

public class Scout extends Character{

    int defaultDef = 50;
    double defaultAtk = 0.7;

	public void specialize() {
	defense -= 5;
	atkRtg += 0.1;
    }

    public void normalize() {
	defense = defaultDef;
	atkRtg = defaultAtk;
    }
	
    public Scout() {
	name = "";
	maxHP = 50;
	HP = 50;
	strength = 20;
	defense = defaultDef;
	atkRtg = defaultAtk;
    }

    public Scout(String newName) {
	this();
	name = newName;
    }
}
