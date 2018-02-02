<html>
<head>

</head>

<body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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