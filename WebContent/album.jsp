<%@ page import="java.io.*, pageController.*, modelObjects.*"%>
<html>
<body>
	<%
		Album album = (Album) request.getAttribute("helper");
		out.println("Name: " + album.getName());
	%>
</body>
</html>