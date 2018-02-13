<html>
<head>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
</head>

<body>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading"><h3>Top Post</h3></div>

        <div class="panel-body">
            <table class="table table-striped" width="700">
                <g:each in="${topPostList}" var="a" status="i">
        %{--<table frame="box" width="700" cellpadding="0" border="2 solid" cellspacing="200">--}%
                    <tr>
                        <td rowspan="3"></td>
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