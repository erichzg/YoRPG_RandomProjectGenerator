//Eric Zhang
//APCS1 pd4
//HW32 - Ye Olde Role Playing Game, Expanded
//2016-11-21

public class Warrior extends Character{

    int defaultDef = 30;
    double defaultAtk = 0.6;

    public Warrior() {
	name = "";
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
