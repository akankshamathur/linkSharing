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
    def resourceService


    @Secured(['permitAll'])
    def home() {
        def recentShareResult = Resource.list(max: 5, offset: 0, sort: "dateCreated", order: 'desc')
        def topPostResult = Resource.list(max: 5, offset: 0, sort: "dateCreated", order: 'desc')
        render(view: '/public/home', model: ['topPostList': topPostResult, 'recentShareList': recentShareResult])
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
        if(user.validate()){
            userService.createUser(user)
            flash.message ="Welcome to Link Sharing , you have successfully registered"
            redirect(action:'home')
        }
        else {
            user.errors.allErrors.each {
                println it
            }
        }


    }


    def test() {
        populateDummyDataService.populateData()
        render 'hello user'
    }


}






