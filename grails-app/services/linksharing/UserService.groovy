package linksharing

import com.linkSharing.User
import grails.transaction.Transactional

@Transactional
class UserService {

    User createUser(User user) {
        user.save(flush: true)
    }
}

