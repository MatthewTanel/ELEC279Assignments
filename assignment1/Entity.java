//Matthew Tanel
//16mdt
//20030711
package assignment1;

public abstract class Entity {
	private String name;
	private Date born;
	private double difficulty;

	public Entity(String name, Date birthDate, double difficulty) {
		this.name = name;
		this.born = new Date(birthDate); // no privacy leak
		this.difficulty = difficulty;
	}

	public Entity(Entity entity) {
		this.name = entity.name;
		this.born = new Date(entity.born); // no privacy leak
		this.difficulty = entity.getDifficulty();
	}

	public String getName() {
		return name;
	}

	public Date getBorn() {
		return new Date(born);
	}

	public double getDifficulty() {
		return difficulty;
	}

	public String toString() {
		return "Name: " + name + "\n" + "Born at: " + born.toString() + "\n";
	}

	public double getAwardedTicketNumber() {
		// System.out.println(difficulty);
		return (difficulty * 100);
	}

	public abstract String entityType();

	public abstract Entity clone();

	public String welcomeMessage() {
		return "Welcome! Let's start the game! " + this.entityType();
	}

	public String closingMessage() {
		return "Congratulations! The detailed information of the entity you guess is: \n" + this.toString();
	}

}
