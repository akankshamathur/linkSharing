package enumTopic

enum Seriousness {
    PUBLIC('public'),
    PRIVATE('private')

    private final String value

    Seriousness(String value) {
        this.value = value
    }

    String getValue() {
        return this.value
    }
}



