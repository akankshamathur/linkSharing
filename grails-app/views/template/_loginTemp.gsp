<html>
<head>

</head>

<body>
<link rel="stylesheet" href="grails-app/assets/stylesheets">
<asset:stylesheet src="application.css"/>
<asset:javascript src="application.js"/>
<div class="container-fluid">
    <div class="row-fluid"><div class="col-lg-12"> Login</div></div>

    <div class="row-fluid">

<table style="margin-outside: 1px solid">
    <form method="POST" action="/login/authenticate" >
        <tr>
            <td><label>Email/Username</label> </td>
            <td><input type="text" size="10" name="username" required></td>
        </tr>
        <tr>
            <td><label>Password</label></td>
            <td> <input type="password" size="10" name="password" required></td>
        </tr>

        <tr>
            <td><g:link  action="">Forget Password</g:link> </td>

            <td>  <button type="submit" value="Login">submit</button>
            </td>

        </tr>
    </form>
</table>
    </div>
</div>
</body>
</html>