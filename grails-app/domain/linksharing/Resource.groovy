package linksharing

class Resource {
    String description
    Date resource_dateCreated
    Date resource_lastUpdated

    static belongsTo = []
    static hasMany = []

    static constraints = {
    }
}
