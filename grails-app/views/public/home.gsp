<html>
<head><meta name="common" content="common"/>
    <title> hello users</title>



</head>

<body style="width: 100%">


%{--<div class="jumbotron">
    <h2>Link Sharing</h2>
</div>--}%

<div class="container-fluid">
    <div class="row"> <div class="col-md-12"><g:render template="/template/topBar"></g:render></div></div>

    <div class="row">
        <div class="col-md-5"><g:render template="/template/recentShare"></g:render></div>

        <div class="col-md-2"></div>

        <div class="col-md-5 pull-right"><g:render template="/template/loginTemp"></g:render></div>

        <div class="col-md-5"><g:render template="/template/topPost"></g:render></div>

        <div class="col-md-2"></div>

        <div class="col-md-5 pull-right"><g:render template="/template/registerTemp"></g:render></div>

    </div>

</div>

</body>
</html>
%{--TODO 2: TEMPLATE FOR HEADER WITH ALL ICONS--}%