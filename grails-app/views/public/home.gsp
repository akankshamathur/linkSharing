<html>
<head>
    <meta name="layout" content="mainCommon"/>
    <title></title>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>

</head>

<body>
<div class="alert" style="display:block"><p align="center" style="text-decoration-color: #255625" ><b>
    ${flash.message}</b></p></div>
<div class="row">
    <div class="col-md-5 pull-left"><g:render template="/public/recentShare" model="recentShareList"/></div>

    <div class="col-md-2"></div>

    <div class="col-md-5 pull-right"><g:render template="/public/loginTemp"/></div>
</div>
<div class="row">

    <div class="col-md-5 pull-left"><g:render template="/public/topPost" model="topPostList"/></div>

    <div class="col-md-2"></div>

    <div class="col-md-5 pull-right"><g:render template="/public/registerTemp"/></div>
</div>
</body>
</html>
