<html>
<head>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
</head>

<body>

Recent Share

<g:each in="${recentShareList}" var="a" status="i">
    ${i + 1}<br>
    User Id :   ${a.user}<br>
    Topic ID :  ${a.topic}<br>
</g:each>

</body>
</html>