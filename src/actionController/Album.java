package actionController;

public class Album {

	private String name;

	public Album(String name) {
		this.name = name;
	}

	private static Album[] albums = { new Album("album1"),
			new RockAlbum("rockalbum1"), new Album("album2") };

	public static Album findNamed(String name) {
		Album album = null;
		for (int i = 0; i < albums.length; i++) {
			if (albums[i].name.equals(name)) {
				album = albums[i];
			}
		}
		return album;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
