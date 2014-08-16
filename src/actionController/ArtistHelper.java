package actionController;

public class ArtistHelper {

	private Artist artist;

	public ArtistHelper(Artist artist) {
		this.artist = artist;
	}

	public String getName() {
		return this.artist.getName();
	}

	public String getType() {
		String type = "";
		if (artist instanceof ClassicalArtist) {
			type = ((ClassicalArtist) artist).getType();
		}
		return type;
	}

}
