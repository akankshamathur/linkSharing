<html>
<head>

</head>

<body>
<asset:stylesheet src="application.css"/>
<asset:javascript src="application.js"/>
<div class="container-fluid">
    <table class="table" frame="box">
        <tr style="border: #010101 ; background-color: #c1e2b3"><h3>Login</h3></tr>

        <form method="POST" action="/login/authenticate">
            <tr>
                <td>Email/Username</td>
                <td><input type="text" size="30" name="username" required></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" size="30" name="password" required></td>
            </tr>

            <tr>
                <td><g:link action="">Forget Password</g:link></td>

                <td><button class="btn btn-primary" type="submit" value="Login">submit</button>
                </td>

            </tr>
        </form>
    </table>
</div>
</div>
</body>
</html>