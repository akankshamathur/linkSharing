package linksharing

import com.linkSharing.User

class ResourceRating {
    String score

    static belongsTo = [users :User , resources : Resource]

    static constraints = {
        score nullable: true, blank: true
    }
}
