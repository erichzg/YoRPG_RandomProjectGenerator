#Documentation for Team YoRPG_RandomProjectGenerator
Team Members: Dawei Huang, Mohamed Tamara, Eric Zhang

##Feature Addition
###Update for xp (Eric Zhang):
**Added level and experience variables for characters.**  
* 4 experience is gained from defeating each enemy.  
* Level is calculated as the square root of experience.  
* All stats are multiplied by 1.1 when leveling up, and HP is fully restored.  

##Code Reconstructions
No part of the origin code was reconstructed for the purposes of augmenting the features into the game. Methods and print statements were inserted in various parts of the code but the overall code structure remained the same.
	
##Stat display (Dawei Huang):
**Added stats display for both character and monster.**  
* Stats are health, strength, defense, and attack rating.  
* Stats display at the end of every encounter.  
	
##Gameplay
	1) Select the difficulty of the gameplay (Easy, Not So Easy, Beowulf hath nothing on me. Bring it on)
	2) Write the name of your character
	3) Choose the class of you character, class info is diplayed (Warrior, Mage, Rogue, Scout, Paladin)
	4) Select whether or not you would like to fight the monster (Nay.: means no, Aye!: means yes)
	5) Proceed until the monster or your character is slain
	6) Review the stats and experienced gained after the round is completed
	7) Repeat steps for another round
