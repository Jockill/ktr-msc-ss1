class Mage extends Character{
	public void attack(String weapon)
	{
		if (!(weapon == "magic" || weapon == "wand"))
			return;

		System.out.println("[" + this.name + "]: Rrrrrrrrr...");
		System.out.println("[" + this.name + "]: Feel the power of my " + weapon + "!");
	}

	Mage(String name, String RPGClass)
	{
		super(name, RPGClass);
			this.life = 70;
			this.agility = 3;
			this.strength = 10;
			this.wit = 10;

			System.out.println("[" + this.name + "]: May the gods be with me.");
	}
}
