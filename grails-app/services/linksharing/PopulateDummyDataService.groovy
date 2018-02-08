package linksharing

import com.linkSharing.User
import grails.transaction.Transactional

@Transactional
class PopulateDummyDataService {


    def populateData() {
        dummyTopic()
        dummySubs()
    }

    def dummyTopic() {

        //TODO 1: add data to all the tables

        Topic topic = new Topic()
        topic.topicName = "java"
        topic.seriousness = "high"
        User user = User.findById(3)
        user.addToTopics(topic).save(flush: true, saveOnError: true)
    }

    def dummySubs() {
        Subscription subscription = new Subscription()
        subscription.seriousness="moderate"
        Topic topic = Topic.findById(8)
        topic.addToSubscriptions(subscription).save(flush: true, saveOnError: true)
        User user = User.findById(3)
        user.addToSubscriptions(subscription).save(flush: true, saveOnError: true)
    }
    

}


