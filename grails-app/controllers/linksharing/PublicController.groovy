package linksharing

import com.linksharing.UserCO
import grails.plugin.springsecurity.annotation.Secured
import in.fintechlabs.linksharing.SubscriptionService
import com.linkSharing.User

@Secured(['permitAll'])
class PublicController {
    def springSecurityService
    def subscriptionService
    def userService
    def populateDummyDataService

    //if user is already loggen in redirect the request to user/index
    def home() {
        User logged = springSecurityService.currentUser as User
        if (logged) {
            redirect(controller: 'user', action: "index")
        }

    }

    def newUser(UserCO userCO) {
        println userCO.properties
        //convert userCO to user domain
        User user = new User()
        user.firstName = userCO.firstName
        user.lastName = userCO.lastName
        user.username = userCO.username
        user.password = userCO.password
        user.email = userCO.email
        userService.createUser(user)
        //TODO: insert flash message for success/failure of operation
    }

    def test() {
        populateDummyDataService.populateData()
        render 'hello user'
    }
}






