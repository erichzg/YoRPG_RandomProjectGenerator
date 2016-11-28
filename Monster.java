//Dawei Huang, Eric Zhang, Mohamed Tamara [Team RandomProjectGenerator]
//Due: 11/23/16
//Period 4 APCS w/ Mr. Brown Mykolyk
//HW#34 -- Ye Olde Role Playing Game, Unchained..

public class Monster extends Character{
    
    public void specialize() {
	defense -= 5;
	atkRtg += 0.1;
    }

    public void normalize() {
	defense = defaultDef;
	atkRtg = defaultAtk;
    }
	
	public Monster() {
	name = "Beowulf";
	HP = 125;
	strength = (int) (Math.random() * 45 + 30);
	defense = 35;
	atkRtg = 1;
    }

}
