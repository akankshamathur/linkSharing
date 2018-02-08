package linksharing

import com.linkSharing.User
import grails.web.servlet.mvc.GrailsParameterMap

class Subscription {
    Date dateCreated
    String seriousness
    User user

    static belongsTo = [topic : Topic]

    static constraints = {
        seriousness blank: true, nullable: true
        user nullable: true, blank: true
        topic nullable: true, blank: true
    }

}
