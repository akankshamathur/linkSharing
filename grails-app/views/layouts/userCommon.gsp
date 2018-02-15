<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title><g:layoutTitle default="Link Sharing"/></title>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>

    <style>
    #header {
        background-color: #9acfea;
        font-family: cursive;

    }
    .icon-size{
        font-size: 1.5em;
        padding-top: 1em;
        padding-right: 1em;
        padding-bottom: 1em;
    }
    </style>
    <g:layoutHead/>
</head>

<body class="container-fluid">

<div id="header">
    <div class="row">
        <div class="col-md-5"><h2>Link Sharing</h2></div>

        <div class="col-md-4"><h2><input class="form-control" type="text" placeholder="Search.."></h2></div>

        <div class="col-md-3">
            <div class="dropdown">
                <span class="glyphicon glyphicon-comment icon-size"></span>
                <span class="glyphicon glyphicon-envelope icon-size"></span>
                <span class="glyphicon glyphicon-link icon-size"></span>
                <span class="glyphicon glyphicon-file icon-size"></span>
                <span class="glyphicon glyphicon-user icon-size"></span>
                <span class="caret" type="button" data-toggle="dropdown"></span>
                    <ul class="dropdown-menu">
                        <li><g:link controller="logout" action="">LOGOUT</g:link> </li>
                    </ul>

            </div>
        </div>
    </div>
</div>
<g:layoutBody/>
</body>
</html>