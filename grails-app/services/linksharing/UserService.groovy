package linksharing

import com.linkSharing.Role
import com.linkSharing.User
import com.linkSharing.UserRole

import grails.transaction.Transactional

@Transactional
class UserService {
    //Role userRole = new Role(authority: 'ROLE_USER').save(failOnError: true)

    User createUser(User user) {
        user.save(flush: true)

    }
}

