

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
                        <td><select name="seriousness" required>
                            <option name="public" value="public">Public</option>
                            <option name="private" value="private">Private</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td colspan="2" class="col-lg-3">
                            <g:submitButton name="submit" class="btn btn-primary btn-block" value="save">SAVE</g:submitButton>
                    </tr>

                </g:form>
            </table>
        </div>
    </div>
