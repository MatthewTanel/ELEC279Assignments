//Matthew Tanel
//16mdt
//20030711
package assignment1;

public class Country extends Entity {
	private String capital;

	public Country(String name, Date birthDate, String capital, double difficulty) {
		super(name, birthDate, difficulty);
		this.capital = capital;
	}

	public Country(Country country) {
		super(country);
		capital = country.getCapital();
	}

	public String getCapital() {
		return capital;
	}

	public Country clone() {
		return new Country(this);
	}

	@Override
	public String toString() {
		return super.toString() + "Capital: " + capital;
	}

	@Override
	public String entityType() {
		return "This entity is a country!";
	}

}
