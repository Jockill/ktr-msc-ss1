class Warrior extends Character{
	public void attack(String weapon)
	{
		if (!(weapon == "hammer" || weapon == "sword"))
			return;

		say("Rrrrrrrrr...");
		say("I'll crush you with my " + weapon + "!");
	}

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
