<html>
<head>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
</head>

<body>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading"><h3>Recent Share</h3></div>

        <div class="panel-body">
            <table class="table table-striped" width="700">
                <g:each in="${recentShareList}" var="a" status="i">
                    <tr>
                        <td>User ID :</td>
                        <td>${a.user}</td>
                    </tr>
                    <tr>
                        <td>Topic ID :</td>
                        <td>${a.topic}</td>
                    </tr>
                    <tr>
                        <td>Description :</td>
                        <td>${a.description}</td>
                    </tr>
                </g:each>
            </table>
        </div>
    </div>
</div>
</body>
</html>