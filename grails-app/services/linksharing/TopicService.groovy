package linksharing

import grails.transaction.Transactional

@Transactional
class TopicService {

    def newTopic(Topic topic) {
        topic.save(flush :true , failOnError:true )
    }
}
