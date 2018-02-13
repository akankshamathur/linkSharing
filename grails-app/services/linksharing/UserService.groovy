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

    def getTopicCount(){


    }

    def getSubscriptionCount(){

    }
}

