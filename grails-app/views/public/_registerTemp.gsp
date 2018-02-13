<html>
<head>

</head>

<body>
<link rel="stylesheet" href="grails-app/assets/stylesheets">
<link rel="stylesheet" href="grails-app/assets/javascripts">

<div class="container-fluid">

    <div class="panel panel-primary">
        <div class="panel-heading"><h3>Register</h3></div>

        <div class="panel-body">
            <table class="table table-striped">
                <form name="register_form" controller="public" method="post">
                    <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" size="30" name="firstName" required></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" size="30" name="lastName" required></td>
                    </tr>
                    <tr>
                        <td>Email Id</td>
                        <td><input type="email" size="30" name="email" required></td>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" size="30" name="username" required></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" size="30" name="password" required></td>
                    </tr>
                    <tr>
                        <td>Confirm Password</td>
                        <td><input type="password" size="30" name="confirmPassword" required></td>
                    </tr>
                    <tr>
                        <td>Photo</td>
                        <td><g:actionSubmitImage value="Browse"></g:actionSubmitImage></td>
                    </tr>
                    <tr>

                        <td colspan="2" class="col-lg-3">
                            <g:actionSubmit class="btn btn-success btn-block" value="register"
                                            action="newUser">Register</g:actionSubmit>
                    </tr>
                    </tbody>

                </form>
            </table>
        </div>
    </div>
</div>
</body>
</html>