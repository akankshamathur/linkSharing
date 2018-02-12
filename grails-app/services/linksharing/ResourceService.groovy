package linksharing

import grails.transaction.Transactional

@Transactional
class ResourceService {
    def recentShareShow() {
        List<Resource>resources=Resource.list(max: 5, offset: 0, sort: "dateCreated", order: 'desc')
        return resources


    }
}
