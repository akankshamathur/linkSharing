<html>
<head>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
</head>

<body>
<div class="container">
    <g:each in="${topPostList}" var="a" status="i">
        ${i + 1}
        <table frame="box" width="700" cellpadding="0" border="2 solid" cellspacing="200">
            <tr style="background-color: #9acfea"><td colspan="3"><h3>Top Post</h3></td></tr>
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

        </table>
    </g:each>
</div>
</body>
</html>