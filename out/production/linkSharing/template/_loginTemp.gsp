<html>
<head>

</head>

<body>
<link rel="stylesheet" href="grails-app/assets/stylesheets">
<asset :javascript src="assets/javascripts "></asset>
<asset :stylesheet src="assets/stylesheets"></asset>

    <div class="p-3 mb-2 bg-info text-white"><b>Login</b></div>
<table>
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

</body>
</html>