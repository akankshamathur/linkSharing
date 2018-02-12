package linksharing

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import com.linkSharing.User

class UserController {

    def springSecurityService

    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    def index() {
//        render "hello user"
       render(view: '/user/userDashboard')
    }

}





