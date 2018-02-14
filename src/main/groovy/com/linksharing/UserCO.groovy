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
        username blank: true, unique: true, nullable: true
        email unique: true, nullable: true, blank: true
        photo nullable: true, blank: true
        firstName nullable: true, blank: true, match:[]
        lastName nullable: true, blank: true
        confirmPassword nullable: true, blank: true
        //confirmPassword validate(){
    }
}