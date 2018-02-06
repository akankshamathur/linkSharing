<html>
<head>
    <title></title>
</head>

<body style="width: 100%">
<asset:stylesheet src="application.css"/>

%{--<div class="jumbotron">
    <h2>Link Sharing</h2>
</div>--}%

<div class="container-fluid">

    <div class="row">
        <div class="col-md-5"><g:render template="/template/recentShare"></g:render></div>

        <div class="col-md-2"></div>

        <div class="col-md-5 pull-right"><g:render template="/template/loginTemp"></g:render></div>

        <div class="col-md-5"><g:render template="/template/recentShare"></g:render></div>

        <div class="col-md-2"></div>

        <div class="col-md-5 pull-right"><g:render template="/template/registerTemp"></g:render></div>

    </div>

</div>
<asset:javascript src="application.js"/>
</body>
</html>
