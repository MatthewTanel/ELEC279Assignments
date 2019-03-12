//Matthew Tanel
//16mdt
//20030711
package assignment1;

public class Person extends Entity {
	private String gender;

	public Person(String name, Date birthDate, String gender, double difficulty) {
		super(name, birthDate, difficulty);
		this.gender = gender;

	}

	public Person(Person person) {
		super(person);
		gender = person.getGender();
	}

	public String getGender() {
		return gender;
	}

	public Person clone() {
		return new Person(this);
	}

	@Override
	public String toString() {
		return super.toString() + "Gender: " + gender;
	}

	@Override
	public String entityType() {
		return "This entity is a person!";
	}

}
