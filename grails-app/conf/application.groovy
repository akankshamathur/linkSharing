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
