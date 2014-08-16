<%@ page import="java.io.*, actionController.*"%>
<html>
<body>
	<%
		RockAlbum album = (RockAlbum) request.getAttribute("helper");
		out.println("Name: " + album.getName());
		out.println("Type: " + album.getType());
	%>
</body>
</html>