package linksharing

import com.linkSharing.User


class Topic {
    Date dateCreated
    Date lastUpdated
    String topicName
    String seriousness


    static hasMany = [subscriptions: Subscription , resources : Resource]
    static belongsTo = [users:User]



    static constraints = {
        topicName blank: true
    }

}
