package linksharing

import com.linkSharing.User

class Resource {
    String description
    Date dateCreated
    Date lastUpdated
    User user

    static hasMany = [readingItems: ReadingItem, resourceRatings: ResourceRating]
    static belongsTo = [topic: Topic]

    static constraints = {
        description nullable: true, blank: true
        user nullable: true, blank: true
        topic nullable: true, blank: true
    }
}
