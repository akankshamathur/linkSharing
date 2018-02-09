package com.linksharing

import com.linkSharing.User
import grails.validation.Validateable

class ResourceRatingCO implements Validateable {
    String score
    User user
    static constraints = {
        score nullable: true, blank: true
        user nullable: true, blank: true
    }
}