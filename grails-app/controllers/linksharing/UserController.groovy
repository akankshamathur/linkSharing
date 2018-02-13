package linksharing

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import com.linkSharing.User

class UserController {

    def springSecurityService
    def userService

    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    def index() {
        User loggedUser=springSecurityService.currentUser
        userService.getTopicCount(loggedUser)
        userService.getSubscriptionCount(loggedUser)
        render(view: '/user/userDashboard' , model: [])
    }
}





