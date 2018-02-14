package linksharing

import com.linksharing.TopicCO
import enumTopic.Seriousness
import grails.plugin.springsecurity.annotation.Secured


class TopicController {
    def topicService
    def springSecurityService


    @Secured(['ROLE_USER'])
    def createTopic(TopicCO topicCO){
        Topic topic = new Topic()
        topic.user=springSecurityService.currentUser
        topic.topicName = topicCO.topicName
        topic.seriousness = topicCO.seriousness
        topicService.newTopic(topic)
    }
}
