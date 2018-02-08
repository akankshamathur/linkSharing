package linksharing

import com.linkSharing.User
import grails.web.servlet.mvc.GrailsParameterMap

class Subscription {
    Date dateCreated
    String seriousness
    Topic topic

    static belongsTo = [user: User]

    static constraints = {
        seriousness blank: true
    }

}
