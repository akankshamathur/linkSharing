<html>
<head></head>

<body>
<asset:stylesheet src="application.css"/>
<asset:javascript src="application.js"/>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading"><h3>Recent Share</h3></div>
        <div class="panel-body">
            <table class="table table-striped" width="700">
                <g:each in="${}" var="" status="i">
                    <tr>
                        <td>User ID :</td>
                        <td>${}</td>
                    </tr>
                    <tr>
                        <td>No. of topics:</td>
                        <td>${}</td>
                    </tr>
                    <tr>
                        <td>No. of subscription :</td>
                        <td>${}</td>
                    </tr>
                </g:each>
            </table>
        </div>
    </div>
</div>

</body>
</html>