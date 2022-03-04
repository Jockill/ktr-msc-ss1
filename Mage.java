class Mage extends Character
{
	public void attack(String weapon)
	{
		if (!(weapon == "magic" || weapon == "wand"))
			return;

		say("Rrrrrrrrr...");
		say("Feel the power of my " + weapon + "!");
	}

	public void moveRight()
	{
		say("moves right furtively");
	}

	public void moveLeft()
	{
		say("moves left furtively");
	}

	public void moveForward()
	{
		say("moves forward furtively");
	}

	public void moveBack()
	{
		say("moves back furtively");
	}

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
