<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019/3/6
  Time: ÏÂÎç8:15
  To change this template use File | Settings | File Templates.
--%>
/* <%@ page contentType="text/html;charset=UTF-8" language="java" %> */

<%@ page language="java" pageEncoding="GB18030"%>

<html>
<head>
    <title>JSP for UserForm form</title>
</head>
<body>
<form method="post" action="./login">
    Username : <input type="text" name="Uname"/><br/>
    Password : <input type="text" name="Password"/><br/>
    <input type="SUBMIT" name="submit" value="Submit">
    <div class="register">
        <a href="register.jsp"><p> new user? register now!<p></a>
    </div>

</form>
</body>
</html>
