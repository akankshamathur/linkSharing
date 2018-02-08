<html>
<head>
    <title><g:layoutTitle default="Link Sharing"/></title>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
    %{--<style>
    #header {
        background-color: #9acfea;
        font-family: cursive;

    }
    #footer {
        background-color: #999999;
        font-family: "Courier New";
        height: 50px;
        text-align: center;
        text-decoration: wavy;

    }
    </style>--}%
    <g:layoutHead/>
</head>

<body class="container-fluid">

<div id="header">
    <div class="row">
        <div class="col-md-4"><h2>Link Sharing</h2></div>

        <div class="col-md-4"><h2><input class="form-control" type="text" placeholder="Search.."></h2></div>

        <div class="col-md-4"><h2></h2></div></div>
</div>
<g:layoutBody/>
<div id="footer"><h3>Thank You</h3></div>
</body>
</html>