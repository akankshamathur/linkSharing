package linksharing

import com.linkSharing.User

class ReadingItem {
    Boolean isRead = Boolean.FALSE
    Resource resource

    static belongsTo = [user: User]

    static constraints = {
        resource nullable: true, blank: true
        user nullable: true, blank: true
    }
}
