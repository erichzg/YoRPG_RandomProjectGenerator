//Eric Zhang
//APCS1 pd4
//HW32 - Ye Olde Role Playing Game, Expanded
//2016-11-21

public class Mage extends Character{

    int defaultDef = 50;
    double defaultAtk = 0.6;

    public Mage() {
	name = "";
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
