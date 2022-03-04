class Warrior extends Character
{
	public void attack(String weapon) throws WeaponException
	{
		if (weapon == "")
			throw new WeaponException(formatSay("I refuse to fight with my bare hands."));
		if (!(weapon == "hammer" || weapon == "sword"))
			throw new WeaponException(formatSay("A " + weapon + "?? What should I do with this?!"));

		say("Rrrrrrrrr...");
		say("I'll crush you with my " + weapon + "!");
	}

	// Movements
	public void moveRight(){ say("moves right like a bad boy"); }
	public void moveLeft(){ say("moves left like a bad boy"); }
	public void moveForward(){ say("moves forward like a bad boy"); }
	public void moveBack(){ say("moves back like a bad boy"); }

	Warrior(String name, String RPGClass)
	{
		super(name, RPGClass);
			this.life = 100;
			this.agility = 10;
			this.strength = 8;
			this.wit = 3;

			say("My name will go down in history!");
	}
}
