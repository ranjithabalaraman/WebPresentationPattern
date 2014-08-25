<%@ page import="java.io.*, pageController.*, modelObjects.*"%>
<html>
<body>

	<%
		//The below is normal approach
		ArtistHelper artisthelper = (ArtistHelper) request
				.getAttribute("helper");
		out.println("Name: " + artisthelper.getName());
		String type = artisthelper.getType();
		if (type != "") {
			out.println("Type: " + type);
		}
	%>
	<!-- The below is template view approach -->
	<jsp:useBean id="helper" type="modelObjects.ArtistHelper"
		scope="request" />
	<B> <%=helper.getName()%></B>
	<B><jsp:getProperty name="helper" property="name"/></B> 

</body>
</html>