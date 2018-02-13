<html>
<head></head>

<body>
<asset:stylesheet src="application.css"/>
<asset:javascript src="application.js"/>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading"><h3>Profile</h3></div>
        <div class="panel-body">
            <table class="table table-striped" width="200px">

                    <tr>
                        <td>User ID :</td>
                        <td>${username}</td>
                    </tr>
                    <tr>
                        <td>No. of topics:</td>
                        <td>${topicCountInfo}</td>
                    </tr>
                    <tr>
                        <td>No. of subscription :</td>
                        <td>${subscriptionCountInfo}</td>
                    </tr>
            </table>
        </div>
    </div>
</div>

</body>
</html>