package linksharing

import com.linkSharing.User
import grails.transaction.Transactional

@Transactional
class PopulateDummyDataService {


    def populateData() {
        dummyTopic()
        dummySubs()
        dummyResource()
        dummyReadItem()
        dummyResourceRating()
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
        Topic topic = Topic.findById(1)
        topic.addToSubscriptions(subscription).save(flush: true, saveOnError: true)
        User user = User.findById(3)
        user.addToSubscriptions(subscription).save(flush: true, saveOnError: true)
    }
    def dummyResource(){
        Resource resource = new Resource()
        resource.description="core java"
        Topic topic = Topic.findById(1)
        topic.addToResources(resource).save(flush: true, saveOnError: true)
        User user = User.findById(3)
        user.addToResources(resource).save(flush: true, saveOnError: true)
    }
    def dummyReadItem(){
        ReadingItem readingItem = new ReadingItem()
        User user = User.findById(3)
        user.addToReadingItems(readingItem).save(flush: true, saveOnError: true)
        Resource resource = Resource.findById(1)
        resource.addToReadingItems(readingItem).save(flush: true, saveOnError: true)

    }
    def dummyResourceRating(){
        ResourceRating resourceRating=new ResourceRating()
        resourceRating.score="5 star"
        User user = User.findById(3)
        user.addToResourceRatings(resourceRating).save(flush: true, saveOnError: true)
        Resource resource = Resource.findById(1)
        resource.addToResourceRatings(resourceRating).save(flush: true, saveOnError: true)



    }
}


