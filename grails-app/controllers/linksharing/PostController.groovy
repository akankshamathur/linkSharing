package linksharing

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured
import grails.web.Controller
import in.fintechlabs.linksharing.SubscriptionService

@Controller
class PostController {

    SubscriptionService subscriptionService

    @Secured(['ROLE_ADMIN'])
    def index() {
        render "hello ADMIN"
    }

    @Secured(['permitAll'])
    def subscribe(){
        Subscription subscription = subscriptionService.subscribe(params)
        render  "HELLO"
    }

}


