

<div class="panel panel-primary">
    <div class="panel-heading"><h3>Share Link Resource</h3></div>

    <div class="panel-body">
        <table class="table table-striped">
            <g:form name="create_topic" controller="topic" method="post" action="createTopic">

                <tr>
                    <td>Link</td>
                    <td><input type="text" size="30" name="link" required></td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><textarea rows="3" cols="29" size="30" name="linkDescription" required></textarea></td>
                </tr>
                <tr>
                    <td>Topic</td>
                    <td>
                        <select name="" style="min-width: 285px">
                            <option></option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td colspan="2" class="col-lg-3">
                        <g:submitButton name="submit" class="btn btn-primary btn-block" value="save">SAVE</g:submitButton>
                </tr>


            </g:form>
        </table>
    </div>
</div>
