<html>
<head>
    <meta name="layout" content="common"/>
    <title></title>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>

</head>

<body>

%{--<div class="jumbotron">
    <h2>Link Sharing</h2>
</div>--}%
<div class="row">
    <div class="col-md-5"><g:render template="/public/recentShare"/></div>

    <div class="col-md-2"></div>

    <div class="col-md-5 pull-right"><g:render template="/template/loginTemp"/></div>

    <div class="col-md-5"><g:render template="/template/topPost"/></div>

    <div class="col-md-2"></div>

    <div class="col-md-5 pull-right"><g:render template="/template/registerTemp"/></div>

</div>
</body>
</html>
