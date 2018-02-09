<html>
<head>
    <title><g:layoutTitle default="Link Sharing"/></title>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>

    <style>
    #header {
        background-color: #9acfea;
        font-family: cursive;

    }

    #footer {
        background-color: #999999;
        font-family: "Courier New";
        height: 30px;
        text-align: center;
        text-decoration: wavy;
        position: absolute;
    }
    </style>
    <g:layoutHead/>
</head>

<body class="container-fluid">

<div id="header">
    <div class="row">
        <div class="col-md-3"><h2>Link Sharing</h2></div>

        <div class="col-md-3"><h2><input class="form-control" type="text" placeholder="Search.."></h2></div>

        <div class="col-md-6">
            <g:createLink controller="public" action="home"><span
                    class="glyphicon glyphicon-chat"></span></g:createLink>
            <g:createLink controller="public" action="home"><span
                    class="glyphicon glyphicon-envelope"></span></g:createLink>
            <g:createLink controller="public" action="home"><span
                    class="glyphicon glyphicon-link"></span></g:createLink>
            <g:createLink controller="public" action="home"><span
                    class="glyphicon glyphicon-file"></span></g:createLink>
            <g:createLink controller="public" action="home"><span
                    class="glyphicon glyphicon-user"></span></g:createLink>

        </div>
    </div>
</div>
<g:layoutBody/>
</body>
</html>