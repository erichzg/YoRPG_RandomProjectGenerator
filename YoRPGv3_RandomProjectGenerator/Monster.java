//Eric Zhang
//APCS1 pd4
//HW32 - Ye Olde Role Playing Game, Expanded
//2016-11-21

public class Monster extends Character{

    public Monster() {
	name = "Beowulf";
	HP = 125;
	strength = (int) (Math.random() * 45 + 30);
	defense = 35;
	atkRtg = 1;
    }

}
