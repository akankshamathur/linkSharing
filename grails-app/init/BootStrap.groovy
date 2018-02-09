import com.linkSharing.Role
import com.linkSharing.User
import com.linkSharing.UserRole
import linksharing.Topic

class BootStrap {
    def springSecurityService
    def populateDummyDataService

    def init = { servletContext ->
//         Role userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
//         Role adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)
//
//         User adminUser = User.findByUsername('admin') ?: new User(
//                 username: 'admin',
//                 password: "admin").save(failOnError: true)
//
//         if (!adminUser.authorities.contains(adminRole)) {
//             UserRole.create adminUser, adminRole
//         }
//         User user = User.findByUsername('akanksha') ?: new User(
//                 username: 'akanksha',
//                 password: 'akanksha').save(failOnError: true)
//
//         if (!user.authorities.contains(userRole)) {
//             UserRole.create user, userRole
//         }
        /* User user1 = new User(username: "admin2", password: "admin2", enabled: true).save(flush:true, failOnError : true)
         new UserRole(user1,adminRole).save(flush:true)*/
         populateDummyDataService.populateData()

    }
    def destroy = {
    }


}
