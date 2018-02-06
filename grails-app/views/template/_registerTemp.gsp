<html>
<head>

</head>
<body>
<link rel="stylesheet" href="grails-app/assets/stylesheets">
<link rel="stylesheet" href="grails-app/assets/javascripts">
<div class="container-float">
    <div class="row-fluid"><div class="col-lg-12" align="left">Register</div></div>
    <table>
    <form name="register_form" controller="">
       <tr>
            <td> <label>First Name</label></td>
            <td><input type="text" size="10" name="firstName" required></td>
        </tr>
        <tr>
            <td><label>Last Name</label></td>
            <td><input type="text" size="10"name="lastName" required></td>
        </tr>
        <tr>
            <td><label>Email Id</label></td>
            <td><input type="email" size="10"name="email" required></td>
        </tr>
        <tr>
            <td><label>Username</label></td>
            <td><input type="text" size="10"name="username" required></td>
        </tr>
        <tr>
            <td><label>Password</label></td>
            <td><input type="password" size="10"name="password" required></td>
        </tr>
        <tr>
            <td><label>Confirm Password</label></td>
            <td><input type="password" size="10"name="" required></td>
        </tr>
        <tr>
            <td><label>Photo</label></td>
            <td><g:actionSubmitImage value="Browse" action=""></g:actionSubmitImage></td>
        </tr>
        <tr>
            <td> <g:link controller="public" action="index">Forget Password</g:link></td>
            <td><g:actionSubmit action="" value="Login"></g:actionSubmit></td>
        </tr>

    </form>
    </table>

</div>
</body>
</html>