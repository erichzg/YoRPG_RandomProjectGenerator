//Eric Zhang
//APCS1 pd4
//HW32 - Ye Olde Role Playing Game, Expanded
//2016-11-21

public class Scout extends Character{

    int defaultDef = 50;
    double defaultAtk = 0.4;

    public Scout() {
	name = "";
	HP = 100;
	strength = 125;
	defense = defaultDef;
	atkRtg = defaultAtk;
    }

    public Scout(String newName) {
	this();
	name = newName;
    }
}
