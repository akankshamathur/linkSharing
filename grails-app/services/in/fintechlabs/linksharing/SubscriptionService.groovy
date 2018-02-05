package in.fintechlabs.linksharing

import grails.transaction.Transactional
import grails.web.servlet.mvc.GrailsParameterMap
import linksharing.Subscription

@Transactional
class SubscriptionService {

    def subscribe(GrailsParameterMap params) {
        Subscription subscription = new Subscription(params)
        subscription.save(flush:true)
        return subscription
    }
}
