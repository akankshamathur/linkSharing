package linksharing

import grails.plugin.springsecurity.annotation.Secured


class PostController {
    def index() {
        @Secured(['userRole'])
        def followAjax = {}

        @Secured(['userRole', 'IS_AUTHENTICATED_FULLY'])
        def addPostAjax = {}

        def global = { render(view: "/login/auth.gsp") }

        @Secured(['userRole'])
        def timeline = {}

        @Secured(['IS_AUTHENTICATED_REMEMBERED'])
        def personal = {}
    }
}


