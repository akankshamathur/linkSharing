package linksharing

import grails.plugin.springsecurity.annotation.Secured
import in.fintechlabs.linksharing.SubscriptionService
import com.linkSharing.User

@Secured(['permitAll'])
class PublicController {
    def springSecurityService
    def subscriptionService
    def userService

   /* demo
    @Secured(['permitAll'])

    def subscribe() {
        Subscription subscription = subscriptionService.subscribe(params)
        render "HELLO"
    }*/


    //if user is already loggen in redirect the request to user/index
    def home() {
            User logged = springSecurityService.currentUser as User
            if (logged) {
                redirect(controller :'user',action :"index")
            }

    }
    def newUser(userCO){
        def user = userService.createUser(params)
        [user:User]
        
    }
}







