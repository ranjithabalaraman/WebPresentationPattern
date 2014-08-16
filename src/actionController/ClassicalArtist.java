package actionController;

public class ClassicalArtist extends Artist {

	private String type;

	public ClassicalArtist(String name) {
		super(name);
		this.setType("Classical");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
