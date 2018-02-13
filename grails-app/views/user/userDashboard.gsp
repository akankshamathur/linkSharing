<html>
<head>
    <meta name="layout" content="userCommon"/>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
</head>
<body>
    <div class="row">
        <div class="col-md-5 pull-left"><g:render template="/user/profile" /></div>

        <div class="col-md-2"></div>

        <div class="col-md-5 pull-right"><g:render template="/user/inbox"/></div>

        <div class="col-md-5 pull-left"><g:render template="/user/subscription"/></div>

        <div class="col-md-2"></div>

        <div class="col-md-5 pull-right"><g:render template="/user/trendingTopics"/></div>
    </div>
</body>
</html>