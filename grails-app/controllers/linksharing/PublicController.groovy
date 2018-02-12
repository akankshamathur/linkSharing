package linksharing

import com.linksharing.UserCO
import grails.plugin.springsecurity.annotation.Secured
import in.fintechlabs.linksharing.SubscriptionService
import com.linkSharing.User

class PublicController {
    def springSecurityService
    def subscriptionService
    def userService
    def populateDummyDataService


    @Secured(['permitAll'])
    def home() {
        User logged = springSecurityService.currentUser as User
        if (logged) {
            redirect(controller: 'user', action: "index")
        }

    }

    @Secured(['permitAll'])
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

    @Secured(['permitAll'])
    def list() {

        def recentShareList = Resource.list(sort:"dateCreated", order:"desc" , max:5 , offset:0)
        render(view: '/list', model: [recentShareList:Resource.list()])
    }
}






