dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = 'org.hibernate.dialect.MySQL5InnoDBDialect'
}

environments {
    development {
        grails.serverURL = "http://dev.moniday.com:8080"
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/linkshare_dev?autoreconnect=true"
            username = "root"
            logSql = false
            password = "nextdefault"
        }


    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/linkshare_dev?autoreconnect=true"
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
            url = "jdbc:mysql://localhost:3306/linkshare_dev?autoreconnect=true&useUnicode=yes&characterEncoding=UTF-8"
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
    staging {
        grails.serverURL = "http://13.58.157.62"
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/linkshare_dev?autoreconnect=true"
            username = "root"
            logSql = false
            password = "7wL3jH2295zWS"
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

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'org.linksharing.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'org.linksharing.UserRole'
grails.plugin.springsecurity.authority.className = 'org.linksharing.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/login/success'
grails.plugin.springsecurity.failureHandler.defaultFailureUrl = '/login/index'
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.auth.loginFromUrl = "/login/index"


