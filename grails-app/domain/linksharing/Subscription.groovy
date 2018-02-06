package linksharing

import com.linkSharing.User
import grails.web.servlet.mvc.GrailsParameterMap

class Subscription {
    Date dateCreated
    String seriousness


    static BelongsTo=[users :User,topics: Topic]

    static constraints = {
        seriousness blank: true
    }

}
