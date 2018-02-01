<html>
<head>

</head>
<body>
<p align="center"><h2>Login</h2>
<g:form name="loginForm" controller="Post" method="POST">
    <label> Email</label> &nbsp; <input type="text" size="70" name="email" required><br>
    <label> Password</label> &nbsp; <input type="password" size="pswd" required><br>
    Remember Me <input type="checkbox" name="remember"> &nbsp;
    <g:actionSubmit value="Login" action="/login/authenticate"></g:actionSubmit>
</g:form>
</p>

</body>
</html>