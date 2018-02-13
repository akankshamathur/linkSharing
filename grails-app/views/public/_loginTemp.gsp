<html>
<head>

</head>

<body>
<asset:stylesheet src="application.css"/>
<asset:javascript src="application.js"/>
<div class="container-fluid">
    <div class="panel panel-primary">
        <div class="panel-heading"><h3>Login</h3></div>

        <div class="panel-body">
            <table class="table table-striped">
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
</div>
</body>
</html>