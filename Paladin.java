//Eric Zhang
//APCS1 pd4
//HW32 - Ye Olde Role Playing Game, Expanded
//2016-11-21

public class Paladin extends Character{

    int defaultDef = 50;
    double defaultAtk = 0.4;

    public Paladin() {
	name = "";
	HP = 150;
	strength = 75;
	defense = defaultDef;
	atkRtg = defaultAtk;
    }

    public Paladin(String newName) {
	this();
	name = newName;
    }
}
