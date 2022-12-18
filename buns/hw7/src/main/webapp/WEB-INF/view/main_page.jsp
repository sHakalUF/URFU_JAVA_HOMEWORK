<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Main page</title>
</head>
<body>
<h1>Main page</h1>
<security:authorize access="hasRole('HR')">
    <p>HR <input type="button" value="Salary" onclick="window.location.href ='hr'"/></p>
</security:authorize>
<security:authorize access="hasRole('MANAGER')">
    <p>Manager <input type="button" value="Performance" onclick="window.location.href ='manager'"/></p>
</security:authorize>
</body>
</html>