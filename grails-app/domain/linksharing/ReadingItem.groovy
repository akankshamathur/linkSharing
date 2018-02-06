package linksharing

import com.linkSharing.User

class ReadingItem {
    Boolean isRead

    static belongsTo = [users:User , resources:Resource]

    static constraints = {
    }
}
