//Matthew Tanel
//16mdt
//20030711
package assignment1;

public class Politician extends Person {
	private String party;

	public Politician(String name, Date birthDate, String gender, String party, double difficulty) {
		super(name, birthDate, gender, difficulty);
		this.party = party;

	}

	public String getParty() {
		return party;
	}

	public Politician(Politician politician) {
		super(politician);
		party = politician.getParty();
	}

	public Politician clone() {
		return new Politician(this);
	}

	@Override
	public String toString() {
		return super.toString() + "\nParty: " + party;
	}

	@Override
	public String entityType() {
		return "This entity is a politician!";
	}

}
