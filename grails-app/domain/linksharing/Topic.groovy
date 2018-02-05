package linksharing


class Topic {
    Date dateCreated
    Date lastUpdated
    String topicName


    static constraints = {
        topicName blank: true
    }

}
