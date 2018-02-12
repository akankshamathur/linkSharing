dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = 'org.hibernate.dialect.MySQL5InnoDBDialect'
}

environments {
    development {
        grails.serverURL = "http://localhost:8080"
        dataSource {
            dbCreate = "none"
            url = "jdbc:mysql://localhost:3306/linkshare_dev?autoreconnect=true"
            username = "root"
            logSql = false
            password = "nextdefault"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/linkshare_test?autoreconnect=true"
            username = "root"
            logSql = false
            password = "nextdefault"
        }

    }
    production {
        dataSource {
            username = "root"
            password = "nextdefault"
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/linkshare_prod?autoreconnect=true&useUnicode=yes&characterEncoding=UTF-8"
            pooled = true
            properties {
                maxActive = -1
                minEvictableIdleTimeMillis = 1800000
                timeBetweenEvictionRunsMillis = 1800000
                numTestsPerEvictionRun = 3
                testOnBorrow = true
                testWhileIdle = true
                testOnReturn = true
                validationQuery = "SELECT 1"
            }
        }
    }
}

//Database Migration
grails.plugin.databasemigration.updateOnStart = true
grails.plugin.databasemigration.updateOnStartFileNames = 'changelog.groovy'

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.linkSharing.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.linkSharing.UserRole'
grails.plugin.springsecurity.authority.className = 'com.linkSharing.Role'
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/user/index'
grails.plugin.springsecurity.failureHandler.defaultFailureUrl = '/'
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.auth.loginFromUrl = "/"
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/', access: ['permitAll']],
        [pattern: '/error', access: ['permitAll']],
        [pattern: '/index', access: ['permitAll']],
        [pattern: '/index.gsp', access: ['permitAll']],
        [pattern: '/shutdown', access: ['permitAll']],
        [pattern: '/assets/**', access: ['permitAll']],
        [pattern: '/**/js/**', access: ['permitAll']],
        [pattern: '/**/css/**', access: ['permitAll']],
        [pattern: '/**/fonts/**', access: ['permitAll']],
        [pattern: '/**/images/**', access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
        [pattern: '/assets/**', filters: 'none'],
        [pattern: '/**/js/**', filters: 'none'],
        [pattern: '/**/css/**', filters: 'none'],
        [pattern: '/**/images/**', filters: 'none'],
        [pattern: '/**/favicon.ico', filters: 'none'],
        [pattern: '/**', filters: 'JOINED_FILTERS']
]

