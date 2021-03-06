package com.linkSharing

import com.sun.org.apache.xpath.internal.operations.Bool
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import linksharing.ReadingItem
import linksharing.Resource
import linksharing.ResourceRating
import linksharing.Subscription
import linksharing.Topic

@EqualsAndHashCode(includes = 'username')
@ToString(includes = 'username', includeNames = true, includePackage = false)
class User implements Serializable {

    private static final long serialVersionUID = 1

    transient springSecurityService

    String username
    String password
    boolean enabled = true
    boolean accountExpired = false
    boolean accountLocked = false
    boolean passwordExpired = false
    String firstName
    String lastName
    String email
    Date dateCreated
    Date lastUpdated
    Boolean admin = Boolean.FALSE
    String photo

    static hasMany = [topics: Topic, subscriptions: Subscription, readingItems: ReadingItem, resources: Resource, resourceRatings: ResourceRating]


    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this)*.role
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
    }

    static transients = ['springSecurityService']

    static constraints = {
        password blank: true, password: true, nullable: true
        username blank: true, unique: true, nullable: true
        email unique: true, nullable: true, blank: true
        photo nullable: true, blank: true
        firstName nullable: true, blank: true
        lastName nullable: true, blank: true
    }

    static mapping = {
        password column: '`password`'
    }
}


