package com.linksharing

import com.linkSharing.User
import grails.validation.Validateable

class SubscriptionCO implements Validateable{
    String seriousness
    static constraints = {
        seriousness blank: true, nullable: true
    }

}