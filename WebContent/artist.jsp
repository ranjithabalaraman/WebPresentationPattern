<%@ page import="java.io.*, pageController.*, modelObjects.*"%>
<html>
<body>
	<%
		ArtistHelper artisthelper = (ArtistHelper) request
				.getAttribute("helper");
		out.println("Name: " + artisthelper.getName());
		String type = artisthelper.getType();
		if (type != "") {
			out.println("Type: " + type);
		}
	%>
</body>
</html>