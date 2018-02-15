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
        firstName nullable: true, blank: true, match:("[a-zA-z]+")
        lastName nullable: true, blank: true, match:("[a-zA-z]+")
        username blank: true, unique: true, nullable: false, match:("[a-zA-z]+")
        email unique: true, nullable: true, blank: true
        photo nullable: true, blank: true
        password blank: true, password: true, nullable: true, validator:{val,obj,errors->
                                            if(!(obj.confirmPassword == val)) errors.rejectValue('password','Does not match')}
        confirmPassword nullable: true, blank: true
    }
}