package linksharing

import com.linkSharing.User

class ResourceRating {
    String score
    User user

    static belongsTo = [resource: Resource]

    static constraints = {
        score nullable: true, blank: true
        resource nullable: true, blank: true
        user nullable: true, blank: true

    }
}
