package linksharing

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import com.linkSharing.User

class UserController {

    def springSecurityService

    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    def index() {
        User loggedUser=springSecurityService.currentUser
        User user=User.get(loggedUser)
        def topics = user.topics*.id
        render(view: '/user/userDashboard')
    }
}





