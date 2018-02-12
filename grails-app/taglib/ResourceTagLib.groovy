class ResourceTagLib{
    def showList = { attrs, body ->
        out << render(template: "/public/recentShare", model: [Resource: attrs.resource])

    }
}