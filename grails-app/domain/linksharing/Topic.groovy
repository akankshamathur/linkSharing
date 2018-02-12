package linksharing

import com.linkSharing.User

import java.beans.Visibility


class Topic {
    Date dateCreated
    Date lastUpdated
    String topicName
    String seriousness
//    Visibility visibility

    static hasMany = [subscriptions: Subscription, resources: Resource]
    static belongsTo = [user: User]


    static constraints = {
        topicName nullable: true, blank: true
        seriousness nullable: true, blank: true
        user nullable: true, blank: true
    }
//    static mapping = {
//        visibility enumType: 'string'
//    }
}
