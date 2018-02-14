package com.linksharing

import grails.validation.Validateable

class TopicCO implements Validateable {
    String topicName
    String seriousness

    static constraints = {
        topicName nullable: true, blank: true
        seriousness nullable: true, blank: true
    }
}