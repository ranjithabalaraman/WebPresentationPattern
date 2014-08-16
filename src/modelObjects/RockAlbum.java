package modelObjects;

public class RockAlbum extends Album {

	private String type;

	public RockAlbum(String name) {
		super(name);
		this.setType("Rock");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
