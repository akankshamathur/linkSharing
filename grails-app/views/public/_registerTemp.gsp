<html>
<head>
    <script>
        $(function () {
            $("#btnSubmit").click(function () {
                var password = $("#password").val();
                var confirmPassword = $("#cpassword").val();
                if (password != confirmPassword) {
                    alert("Passwords do not match.");
                    return false;
                }
                return true;
            });
        });

    </script>
    <script src="form-validation.js"></script>
</head>
<body>
<div class="panel panel-primary">
    <div class="panel-heading"><h3>Register</h3></div>
    <div class="panel-body">
        <table class="table table-striped">
            <form name="register_form" controller="public" method="post">
                <tbody>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" id="firstName" size="30" name="firstName" placeholder="Enter First Name" required></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" id="lastName" size="30" name="lastName" placeholder="Enter Last Name" required></td>
                </tr>
                <tr>
                    <td>Email Id</td>
                    <td><input type="email" id="email"  size="30" name="email" placeholder="Enter email ID" required></td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" id="username" size="30" name="username" placeholder="Create Username" required></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" id="password" size="30" name="password" required></td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td><input type="password" id="cpassword" size="30" name="confirmPassword" required></td>
                </tr>
                <tr>
                    <td>Photo</td>
                    <td><g:actionSubmitImage value="Browse"></g:actionSubmitImage></td>
                </tr>
                <tr>

                    <td colspan="2" class="col-lg-3">
                        <g:actionSubmit class="btn btn-success btn-block" id="btnSubmit" value="register"
                                        action="newUser">Register</g:actionSubmit>
                </tr>
                </tbody>

            </form>
        </table>
    </div>
</div>


</body>
</html>
