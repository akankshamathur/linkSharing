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

        <div class="col-md-5 pull-right"><g:render template="/resource/shareLink"/></div>
    </div>
<div class="row">

        <div class="col-md-5 pull-left"><g:render template="/topic/createTopic" /></div>

        <div class="col-md-2"></div>

        <div class="col-md-5 pull-right"></div>
    </div>
</body>
</html>