package linksharing

import com.linkSharing.User
import grails.transaction.Transactional

@Transactional
class UserService {

    User createUser(Map userCO) {
        User user = new User()
        user.username=userCO.username
        user.password=userCO.password
        user.firstName=userCO.firstName
        user.lastName=userCO.lastName
        user.email=userCO.email
        user.photo=userCO.photo



    }
}
