package linksharing

import com.linkSharing.User

class Resource {
    String description
    Date dateCreated
    Date lastUpdated

    static hasMany = [readingItems: ReadingItem , resourceRatings : ResourceRating]
    static  belongsTo = [topics : Topic , users :User]

    static constraints = {
    }
}
