package linksharing

import com.linkSharing.User


class Topic {
    Date dateCreated
    Date lastUpdated
    String topicName
    String seriousness

    static hasMany = [subscriptions: Subscription, resources: Resource]
    static belongsTo = [user: User]


    static constraints = {
        topicName blank: true
    }

}
