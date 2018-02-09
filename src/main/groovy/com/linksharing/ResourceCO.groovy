package com.linksharing

import com.linkSharing.User
import grails.validation.Validateable

class ResourceCO implements Validateable{
    String description
    User user
    static constraints = {
        description nullable: true, blank: true
        user nullable: true, blank: true

    }

}