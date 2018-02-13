package linksharing

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import com.linkSharing.User

class UserController {

    def springSecurityService
    def userService

    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    def index() {
        User user=springSecurityService.currentUser
        def topicCount=userService.getTopicCount(user)
        def subscriptionCount=userService.getSubscriptionCount(user)
        render(view: '/user/userDashboard' , model:[topicCountInfo: topicCount, subscriptionCountInfo: subscriptionCount , username:user])

    }
}





