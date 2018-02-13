package linksharing

import com.linkSharing.Role
import com.linkSharing.User
import com.linkSharing.UserRole

import grails.transaction.Transactional

@Transactional
class UserService {

    def createUser(User user) {
        user.save(flush: true)
//        if(user){
//            flash.message = "successful"
//        }
        Role role = Role.findByAuthority('ROLE_USER')
        UserRole.create(user, role)
    }

    def getTopicCount(User user){
        def getTopic = user.topics
        println "topic count = ${getTopic.size()}"
    }

    def getSubscriptionCount(User user){
        def getSubscription = user.subscriptions
        println "subscription count= ${getSubscription.size()}"
    }
}

