package assignment1;

public class Country extends Entity {
private String capital;

public Country(String name, Date birthDate) {
	super(name, birthDate);
	
}

public Country(Country country) {
	super(country);
}

@Override
public String entityType() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Entity clone() {
	// TODO Auto-generated method stub
	return null;
}

public Country clone() {
	
}


}
