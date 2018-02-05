package linksharing

import grails.web.servlet.mvc.GrailsParameterMap

class Subscription {
    Date dateCreated
    Date lastUpdated

    String seriousness

//    static BelongsTo=[]

    static constraints = {
        seriousness blank: true
    }

}
