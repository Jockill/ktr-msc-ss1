public abstract class Character implements Movable
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

	public String formatSay(String sentence)
	{
		return ("[" + this.name + "]: " + sentence);
	}

	public void attack(String weapon) throws WeaponException
	{
		say("Rrrrrrrrr...");
	}

	public void unsheathe() { say("unsheathe his weapon."); }

	public void tryToAttack(String weapon)
	{
		try
		{
			attack(weapon);
		} catch (WeaponException e)
		{
			System.out.println(e.getMessage());
		}
	}

	//> Movements
	/* J'ai pris l'initiative de modifier les print de moveForward() et moveBack()
	* car ils me semblaient inversés dans le sujet.
	*/
	public void moveRight() {	say("moves right"); }
	public void moveLeft() {	say("moves left"); }
	public void moveForward() {	say("moves forward"); }
	public void moveBack() {	say("moves back"); }

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
