//Matthew Tanel
//16mdt
//20030711
package assignment1;

public class Singer extends Person {
	private String debutAlbum;
	private Date debutAlbumReleaseDate;

	public Singer(String name, Date birthDate, String gender, String debutAlbum, Date debutAlbumReleaseDate,
			double difficulty) {
		super(name, birthDate, gender, difficulty);
		this.debutAlbum = debutAlbum;
		this.debutAlbumReleaseDate = debutAlbumReleaseDate;
	}

	public Singer(Singer singer) {
		super(singer);
		debutAlbum = singer.getAlbum();
		debutAlbumReleaseDate = singer.getAlbumRD();

	}

	public String getAlbum() {
		return debutAlbum;
	}

	public Date getAlbumRD() {
		return debutAlbumReleaseDate;
	}

	public Singer clone() {
		return new Singer(this);
	}

	@Override
	public String toString() {
		return super.toString() + "\nDebut Album: " + debutAlbum + "\nRelease Date: " + debutAlbumReleaseDate;
	}

	@Override
	public String entityType() {
		return "This entity is a singer!";
	}

}
