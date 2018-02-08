package linksharing

import grails.transaction.Transactional

@Transactional
class PopulateDummyDataService {

    def serviceMethod() {
        //TODO 1: add data to all the tables

        Topic topic = new Topic()
        topic.topicName='java'
        topic.seriousness='high'
        topic.save(flush:true)



    }
}
