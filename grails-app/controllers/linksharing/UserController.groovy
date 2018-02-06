package linksharing

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import org.linksharing.User


class UserController {

    def springSecurityService

    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    def index() {
        render springSecurityService.currentUser
        //render (view:'user/userDashboard')
    }


//
//        @Secured(['ROLE_ADMIN'])
//        def validAdmin() {
//            render "hello admin"
//        }
//        @Secured(['PermitAll'])
//        def invalidUser() {
//            render(view: '/public/home')
//        }
//        @Secured(['ROLE_USER'])
//        def validUser() {
//            render "hello user"
//        }

}




