package actionController;

public class Artist {

	private String name;

	public Artist(String name) {
		this.name = name;
	}

	private static Artist[] artists = { new Artist("Bob Dylan"),
			new ClassicalArtist("Eric Clapton"), new Artist("Bryan Adams") };

	public static Artist findNamed(String name) {
		Artist artist = null;
		for (int i = 0; i < artists.length; i++) {
			if (artists[i].name.equals(name)) {
				artist = artists[i];
			}
		}
		return artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
