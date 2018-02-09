package com.linksharing

import com.linkSharing.User
import grails.validation.Validateable

class ReadingItemCO implements Validateable{
    User user
    static constraints = {
        user nullable: true, blank: true
    }

}