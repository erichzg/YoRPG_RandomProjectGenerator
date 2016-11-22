//Eric Zhang
//APCS1 pd4
//HW32 - Ye Olde Role Playing Game, Expanded
//2016-11-21

public class Rogue extends Character{

    int defaultDef = 30;
    double defaultAtk = 0.4;

    public Rogue() {
	name = "";
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
