class Mage extends Character
{
	public void attack(String weapon) throws WeaponException
	{
		// Exceptions handling
		if (weapon == "")
			throw new WeaponException(formatSay("I refuse to fight with my bare hands."));
		if (!(weapon == "magic" || weapon == "wand"))
			throw new WeaponException(formatSay("I don't need this stupid " + weapon + "! Don't misjudge my powers!"));

		say("Rrrrrrrrr...");
		say("Feel the power of my " + weapon + "!");
	}

	// Movements
	public void moveRight(){ say("moves right furtively"); }
	public void moveLeft(){ say("moves left furtively"); }
	public void moveForward(){ say("moves forward furtively"); }
	public void moveBack(){ say("moves back furtively"); }

	Mage(String name, String RPGClass)
	{
		super(name, RPGClass);
			this.life = 70;
			this.agility = 3;
			this.strength = 10;
			this.wit = 10;

			say("May the gods be with me.");
	}
}
