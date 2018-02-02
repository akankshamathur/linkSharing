<html>
<head>

</head>

<body>
<link rel="stylesheet" href="grails-app/assets/stylesheets">

<div class="container">
    <div class="top_bar">Login</div>
    <g:form name="login_form" controller="">
        <label>Email/Username</label> &nbsp; <input type="text" size="75" name="username" required><br>
        <label>Password</label> &nbsp; <input type="password" size="80" name="password" required><br>
        <g:link controller="" action="">Forget Password</g:link> &nbsp; <g:actionSubmit action=""
                                                                                        value="Login"></g:actionSubmit>
    </g:form>

</div>
</body>
</html>