<html>
<head>
    <style>
    .table{
        width: 20em;
    }

    </style>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
</head>

<body>
<div class="container">
    <g:each in="${recentShareList}" var="a" status="i">
        ${i + 1}
        <table class="table" frame="box" size="30" >
            <th style="background-color: #9acfea"><h3>Recent Share</h3></th>
            <tr>
                <td>User ID :${a.user}</td>
            </tr>
            <tr>
                <td>Topic ID :${a.topic}</td>
            </tr>
            <tr>
                <td>Description :${a.description}</td>
            </tr>

        </table>
    </g:each>
</div>
</body>
</html>