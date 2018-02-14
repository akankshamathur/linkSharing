class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // "/login/$action?"(controller: "login")
                //   "/logout/$action?"(controller: "logout")
                // apply constraints here
            }
        }

        "/"(controller: 'public', action: 'home')
        '/user/index'(controller: 'user', action: 'index')
        '/topic/createTopic'(controller: 'topic', action: 'createTopic')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
