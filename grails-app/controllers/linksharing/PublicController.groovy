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
        def result = Resource.list(max: 5, offset: 0, sort: "dateCreated", order: 'desc')
        render(view:'/public/home',model: [recentShareList: result])
//        User logged = springSecurityService.currentUser as User
//        if (logged) {
//            redirect(controller: 'user', action: "index")
//        }


//TODO:fetch recent share and then pass it to home.gsp
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

//        List<Resource> resources = Resource.createCriteria().list {
//            [sort  : "dateCreated",
//             order : "desc",
//             max   : 5,
//             offset: 0]
//        }
//        def resourceList = Resource.createCriteria()
//        def result = resourceList.list {
//            [max: 5, offset:0 , sort: "dateCreated", order: 'desc']
//        }
        println "hello"
        println "hello"
        println "hello"
        println "hello"
        println "hello"

        Resource result = Resource.list(max: 5, offset: 0, sort: "dateCreated", order: 'desc')
        render(view: '/public/recentShare', model: [recentShareList: result])
    }
}






