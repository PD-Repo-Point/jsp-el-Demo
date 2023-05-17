<%@ page import="model.Employee"%>


<html>
<head>
    <title>Employee Info</title>
</head>
<body>
<%
    Employee emp = (Employee) request.getAttribute("emp");
    out.println("First Name: "+emp.getFirstName);


%>
</body>
</html>