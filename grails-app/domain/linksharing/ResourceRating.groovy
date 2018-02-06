package linksharing

import com.linkSharing.User

class ResourceRating {
    String score
    Resource resources

    static belongsTo = [users :User]

    static constraints = {
        score nullable: true, blank: true
    }
}
