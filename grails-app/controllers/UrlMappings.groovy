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
        //"/"(view: "/index")
        "/user/validUser"(controller: 'user', action: 'validUser')
        "/user/index"(controller: 'user', action: 'index')

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
