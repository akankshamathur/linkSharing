package linksharing

import com.linkSharing.User

class ReadingItem {
    Boolean isRead = Boolean.FALSE
    User user

    static belongsTo = [resource : Resource]

    static constraints = {
        resource nullable: true, blank: true
        user nullable: true, blank: true
    }
}
