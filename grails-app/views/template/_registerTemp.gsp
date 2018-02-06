<html>
<head>

</head>

<body>
<link rel="stylesheet" href="grails-app/assets/stylesheets">
<link rel="stylesheet" href="grails-app/assets/javascripts">

<div class="container-fluid">

    <table class="table" frame="box">
        <thead class=""><h3>Register</h3></thead>

        <form name="register_form" controller="">
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
                <td><input type="password" size="30" name="" required></td>
            </tr>
            <tr>
                <td>Photo</td>
                <td><g:actionSubmitImage value="Browse" action=""></g:actionSubmitImage></td>
            </tr>
            <tr>

                <td colspan="2" class="col-lg-3"><button class="btn btn-success btn-block" type="submit"
                                                         value="Register">Register</button>
            </tr>

        </form>
    </table>

</div>
</body>
</html>