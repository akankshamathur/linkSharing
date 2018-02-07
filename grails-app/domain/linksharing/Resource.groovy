package linksharing

import com.linkSharing.User

class Resource {
    String description
    Topic topic
    Date dateCreated
    Date lastUpdated

    static hasMany = [readingItems: ReadingItem , resourceRatings : ResourceRating]
    static  belongsTo = [user :User]

    static constraints = {
    }
}
