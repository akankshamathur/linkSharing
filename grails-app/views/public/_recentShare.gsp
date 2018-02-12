<html>
<head>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
</head>

<body>

Recent Share
<div class="container">
    <g:each in="${result}" var="a" status="i">
    ${i + 1}<br>
    <div class="row">
        <div class="col-md-6">User ID :</div>
        <div class="col-md-6"> ${a.user}<br></div>
    </div>
        <div class="row">
            <div class="col-md-6">Topic ID :</div>
            <div class="col-md-6">  ${a.topic}</div>
        </div>
        <div class="row">
            <div class="col-md-6">Description :</div>
            <div class="col-md-6"> ${a.description}</div>
        </div>
    </g:each>
</div>



</body>
</html>