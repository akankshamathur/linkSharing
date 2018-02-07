<html>
<head>

</head>

<body>
<asset:stylesheet src="application.css"/>
<asset:javascript src="application.js"/>

<div class="container">
    <div class="row-fluid">
        <div class="col-lg-4"><h1>Link Sharing</h1></div>
        <div class="col-lg-4"><h1> <input type="text" placeholder="Search.."></h1></div>
        <div class="col-lg-4"><h1>icon</h1></div>
    </div>
    <div class="row-fluid">
        <div class="col-lg-6"><g:render template="/template/profile"></g:render></div>
        <div class="col-lg-6"><g:render template="/template/inbox"></g:render></div>
    </div>
</div>
</body>
</html>