<html>
<head>

</head>

<body>
<link rel="stylesheet" href="grails-app/assets/stylesheets">
<link rel="stylesheet" href="grails-app/assets/javascripts">

<div class="container-fluid">

    <div class="panel panel-primary">
        <div class="panel-heading"><h3>Create Topic</h3></div>

        <div class="panel-body">
            <table class="table table-striped">
                <g:form name="create_topic" controller="topic" method="post" action="createTopic">

                    <tr>
                        <td>Topic Name</td>
                        <td><input type="text" size="30" name="topicName" required></td>
                    </tr>
                    <tr>
                        <td>Visibility</td>
                        <td><select required>
                            <option name="public">Public</option>
                            <option name="private">private</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td colspan="2" class="col-lg-3">
                            <g:actionSubmit class="btn btn-primary btn-block" value="save">SAVE</g:actionSubmit>
                    </tr>

                </g:form>
            </table>
        </div>
    </div>
</div>
</body>
</html>