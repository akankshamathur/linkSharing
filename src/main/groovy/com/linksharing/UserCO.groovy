package com.linksharing

import grails.validation.Validateable

class UserCO implements Validateable {
    String username
    String password
    String confirmPassword
    String firstName
    String lastName
    String email
    String photo


    static constraints = {
        password blank: true, password: true, nullable: true
        username blank: false, unique: true, nullable: false,match:("[a-zA-z]")
        email unique: true, nullable: true, blank: true
        photo nullable: true, blank: true
        firstName nullable: true, blank: true, match:("[a-zA-z]")
        lastName nullable: true, blank: true, match:("[a-zA-z]")
        confirmPassword nullable: true, blank: true
    }
}