import org.linksharing.Role
import org.linksharing.User
import org.linksharing.UserRole

class BootStrap {
    def springSecurityService

    def init = {
        def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
        def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)

        def adminUser = User.findByUsername('admin') ?: new User(
                username: 'admin',
                password: springSecurityService.encodePassword('admin'),
                enabled: true).save(failOnError: true)

        if (!adminUser.authorities.contains(adminRole)) {
            UserRole.create adminUser, adminRole
        }
        def user = User.findByUsername('akanksha') ?: new User(
                username: 'akanksha',
                password: springSecurityService.encodePassword('akanksha'),
                enabled: true).save(failOnError: true)

        if (!user.authorities.contains(userRole)) {
            UserRole.create user, userRole
        }

    }
    def destroy = {
    }


}
