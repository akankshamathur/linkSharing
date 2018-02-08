package linksharing

import com.linkSharing.User
import grails.transaction.Transactional

@Transactional
class PopulateDummyDataService {


    def populateData() {
        dummyTopic()
    }

    def dummyTopic() {
        println "hello"
        //TODO 1: add data to all the tables

        Topic topic = new Topic()
        topic.topicName = "java"
        topic.seriousness = "high"
        User user = User.findById(3)
        user.addToTopics(topic).save(flush: true, saveOnError: true)
    }

    /*dummyArticle ( ) {

    }*/
}
