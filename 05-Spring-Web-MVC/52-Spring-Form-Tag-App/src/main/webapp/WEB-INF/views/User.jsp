<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "tca" %>

<html>
<body>

<h1>User Information !! </h1>
<tca:form modelAttribute="user" method = "POST" action = "/register">
User Name : <tca:input type = "text" path = "name"/><br>
Email I'd  : <tca:input type = "email" path = "email"/><br>
Mobile    : <tca:input type="text" path = "mobile"/><br>
Gender    : <tca:radiobutton path = "gender" value = "Male" label="Male"/>
            <tca:radiobutton path = "gender" value = "Female" label="Female"/><br>
<input type = "submit" value="Submit"> <br>
</tca:form>
</body>

</html>