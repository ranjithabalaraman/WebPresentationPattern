<%@ page import="java.io.*, actionController.*"%>
<html>
<body>
	<%
		Album album = (Album) request.getAttribute("helper");
		out.println("Name: " + album.getName());
	%>
</body>
</html>