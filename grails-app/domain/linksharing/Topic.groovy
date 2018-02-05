package linksharing

import org.linksharing.User

class Topic {
    Date dateCreated
    Date lastUpdated
    String topicName

    static belongsTo = [User]

    static constraints = {
        topicName blank: true
    }

}
