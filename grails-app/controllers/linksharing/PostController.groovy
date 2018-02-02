package linksharing

import grails.plugin.springsecurity.annotation.Secured


class PostController {

    @Secured(['ROLE_ADMIN'])
    def index() {
        render "hello ADMIN"
    }


    def login(){

    }

}


