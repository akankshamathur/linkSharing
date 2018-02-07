package linksharing

import com.linkSharing.User

class ReadingItem {
    Boolean isRead
    Resource resource

    static belongsTo = [users:User]

    static constraints = {
    }
}
