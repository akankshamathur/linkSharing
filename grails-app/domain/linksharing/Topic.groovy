package linksharing

import org.linksharing.User

class Topic {
    Date dateCreated
    Date lastUpdated
    String topicName

    static belongsTo = [User]
    static hasMany=[]

    static constraints = {

    }

}
