package linksharing

import grails.plugin.springsecurity.annotation.Secured


@Secured(['permitAll'])
class PublicController {

    def home() {
        render(view: '/public/home')
    }
}
