<html>
<head>

</head>

<body>
<asset:stylesheet src="application.css"/>
<asset:javascript src="application.js"/>

<div class="jumbotron">
    <div class="row-fluid"><h2> Link Sharing</h2></div></div>
<div class="container-fluid">

    <div class="row-fluid">
        <div class="col-lg-6">  <g:render template="/template/recentShare"></g:render></div>
        <div class="col-lg-6">  <g:render template="/template/loginTemp"></g:render></div>
    </div>
    <div class="row-fluid">
        <div class="col-lg-6"><g:render template="/template/recentShare"></g:render></div>
        <div class="col-lg-6"><g:render template="/template/registerTemp"></g:render></div>
    </div>
</div>

</body>
</html>
