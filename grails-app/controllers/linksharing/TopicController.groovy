package linksharing

import grails.plugin.springsecurity.annotation.Secured

class TopicController {

    @Secured(['ROLE_USER'])
    def index() {
//        render "create topic"
        render(view:'/template/createTopic')

    }
    @Secured(['ROLE_USER'])
    def create(){

    }
    def list(){

    }
    def edit(){

    }
    def delete(){

    }
}
