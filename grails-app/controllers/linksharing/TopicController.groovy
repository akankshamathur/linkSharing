package linksharing

import grails.plugin.springsecurity.annotation.Secured

class TopicController {

    @Secured(['ROLE_USER'])
    def createTopic(){
        render "create a topic"
    }
}
