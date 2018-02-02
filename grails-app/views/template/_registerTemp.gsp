<html>
<head>

</head>
<body>
<link rel="stylesheet" href="grails-app/assets/stylesheets">
<link rel="stylesheet" href="grails-app/assets/javascripts">
<div class="container">
    <div class="top_bar"> Register</div>
    <g:form name="register_form" controller="">
        <label>First Name</label> &nbsp; <input type="text" size="40" name="firstName" required><br>
        <label>Last Name</label> &nbsp; <input type="text" size="40"name="lastName" required><br>
        <label>Email Id</label> &nbsp; <input type="email" size="40"name="email" required><br>
        <label>Username</label> &nbsp; <input type="text" size="40"name="username" required><br>
        <label>Password</label> &nbsp; <input type="password" size="40"name="password" required><br>
        <label>Confirm Password</label> &nbsp; <input type="password" size="40"name="" required><br>
        <label>Photo</label> &nbsp; <g:actionSubmitImage value="Browse" action=""
                                                         src="${resource(dir: 'images', file: 'update.gif')}"></g:actionSubmitImage>
        <g:link controller="" action="">Forget Password</g:link> &nbsp; <g:actionSubmit action="" value="Login"></g:actionSubmit>
    </g:form>

</div>
</body>
</html>