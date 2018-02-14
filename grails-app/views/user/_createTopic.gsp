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
                <form name="create_from" controller="topic" method="post">
                    <tbody>
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
                        <td class="col-md-6">
                            <g:actionSubmit class="btn btn-success btn-block" value="SAVE"
                                            action="createTopic">Save</g:actionSubmit></td>
                        <td class="col-md-6"><button type="reset" class="btn btn-primary btn-block" value="Reset">Reset</button></td>
                    </tr>
                    </tbody>

                </form>
            </table>
        </div>
    </div>
</div>
</body>
</html>