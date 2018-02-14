<div class="panel panel-primary">
    <div class="panel-heading"><h3>Recent Share</h3></div>

    <div class="panel-body">

        <g:each in="${recentShareList}" var="a" status="i">
            <div class="row">
                <div class="col-lg-1"></div>

                <div class="col-lg-4">User ID :</div>

                <div class="col-lg-2"></div>

                <div class="col-lg-4">${a.user}</div>

                <div class="col-lg-1"></div>
            </div>

            <div class="row">

                <div class="col-lg-1"></div>

                <div class="col-lg-4">Topic ID :</div>

                <div class="col-lg-2"></div>

                <div class="col-lg-4">${a.topic}</div>

                <div class="col-lg-1"></div>
            </div>

            <div class="row">
                <div class="col-lg-1"></div>

                <div class="col-lg-4">Description :</div>

                <div class="col-lg-2"></div>

                <div class="col-lg-4">${a.description}</div>

                <div class="col-lg-1"></div>
            </div>
        </g:each>
    </div>
</div>
