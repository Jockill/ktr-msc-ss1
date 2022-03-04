public abstract class Character
{
	protected String name;
	protected final String RPGClass;
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;

	// Getters
	public String getName() { return this.name; }
	public String getRPGClass() { return this.RPGClass; }
	public int getLife() { return this.life; }
	public int getAgility() { return this.agility; }
	public int getStrength() { return this.strength; }
	public int getWit() { return this.wit; }

	// Methods
	public void say(String sentence)
	{
		System.out.println("[" + this.name + "]: " + sentence);
	}

	public void attack(String weapon)
	{
		say("Rrrrrrrrr...");
	}

	// Constructor
	Character(String name, String RPGClass)
	{
		this.name = name;
		this.RPGClass = RPGClass;
		this.life = 50;
		this.agility = 2;
		this.strength = 2;
		this.wit = 2;
	}
}
