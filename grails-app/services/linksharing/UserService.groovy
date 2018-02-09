package linksharing

import com.linkSharing.Role
import com.linkSharing.User
import com.linkSharing.UserRole

import grails.transaction.Transactional

@Transactional
class UserService {

    def createUser(User user) {
        user.save(flush: true)
        Role role = Role.findByAuthority('ROLE_USER')
        UserRole.create(user,role)
    }
}

