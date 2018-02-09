package linksharing

import com.linkSharing.Role
import com.linkSharing.User
import com.linkSharing.UserRole

import grails.transaction.Transactional

@Transactional
class UserService {
    //Role userRole = new Role(authority: 'ROLE_USER')
    User createUser(User user) {
        Role role = Role.findById(1)

        UserRole.create(user, role, true)
        //User.create(user, role, true)
        user.save(flush: true)
    }
}

