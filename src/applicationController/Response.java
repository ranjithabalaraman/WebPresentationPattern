package applicationController;

public class Response {
	private Class domainCommand;
	private String viewUrl;

	public Response(Class domainCommand, String viewUrl) {
		this.domainCommand = domainCommand;
		this.viewUrl = viewUrl;
	}

	public DomainCommand getDomainCommand() throws InstantiationException, IllegalAccessException {
		return (DomainCommand) domainCommand.newInstance();
	}

	public String getViewUrl() {
		return viewUrl;
	}

}
