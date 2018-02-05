package linksharing

class ResourceRating {
    String score

    static constraints = {
        score nullable: true, blank: true
    }
}
