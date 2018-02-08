databaseChangeLog = {

    changeSet(author: "akanksha (generated)", id: "1517982895455-1") {
        createTable(tableName: "reading_item") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "reading_itemPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "is_read", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "resource_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "users_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-2") {
        createTable(tableName: "resource") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "resourcePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "topic_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "class", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "url", type: "VARCHAR(255)")

            column(name: "file_path", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-3") {
        createTable(tableName: "resource_rating") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "resource_ratingPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "resources_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "score", type: "VARCHAR(255)")

            column(name: "users_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-4") {
        createTable(tableName: "role") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "rolePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "authority", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-5") {
        createTable(tableName: "subscription") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "subscriptionPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "seriousness", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "topic_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-6") {
        createTable(tableName: "topic") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "topicPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "seriousness", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "topic_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-7") {
        createTable(tableName: "user") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "userPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "account_expired", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "account_locked", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "admin", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "email", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "enabled", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "first_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "password", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "password_expired", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "photo", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "username", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-8") {
        createTable(tableName: "user_role") {
            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "role_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-9") {
        addPrimaryKey(columnNames: "user_id, role_id", constraintName: "user_rolePK", tableName: "user_role")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-10") {
        addUniqueConstraint(columnNames: "authority", constraintName: "UC_ROLEAUTHORITY_COL", tableName: "role")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-11") {
        addUniqueConstraint(columnNames: "email", constraintName: "UC_USEREMAIL_COL", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-12") {
        addUniqueConstraint(columnNames: "username", constraintName: "UC_USERUSERNAME_COL", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-13") {
        addForeignKeyConstraint(baseColumnNames: "topic_id", baseTableName: "resource", constraintName: "FK_29on5nwfvvdmtimh40b7tnsw5", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "topic")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-14") {
        addForeignKeyConstraint(baseColumnNames: "resource_id", baseTableName: "reading_item", constraintName: "FK_93xit1asu8caf665svq0vqmeq", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-15") {
        addForeignKeyConstraint(baseColumnNames: "topic_id", baseTableName: "subscription", constraintName: "FK_aojatoh2ykivd0ukh09f4mn11", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "topic")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-16") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK_apcc8lxk2xnug8377fatvbn04", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-17") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "topic", constraintName: "FK_c975xs66f0v6extdjdl0csctr", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-18") {
        addForeignKeyConstraint(baseColumnNames: "users_id", baseTableName: "reading_item", constraintName: "FK_hs3nqkr6g6337tijc82bn7nnv", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-19") {
        addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK_it77eq964jhfqtu54081ebtio", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-20") {
        addForeignKeyConstraint(baseColumnNames: "users_id", baseTableName: "resource_rating", constraintName: "FK_j05t79wu8kvni4c306a58v0q0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-21") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "resource", constraintName: "FK_jxdy8bryv19kw1c8cghxvi3de", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-22") {
        addForeignKeyConstraint(baseColumnNames: "resources_id", baseTableName: "resource_rating", constraintName: "FK_tdr83k5fwq26uvwvagufj614i", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "akanksha (generated)", id: "1517982895455-23") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "subscription", constraintName: "FK_tq3cq3gmsss8jjyb2l5sb1o6k", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }
    changeSet(author: "akanksha (generated)", id: "1517992612235-22") {
        dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "email", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517992612235-23") {
        dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "first_name", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517992612235-24") {
        dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "last_name", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517992612235-25") {
        dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "password", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517992612235-26") {
        dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "photo", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517992612235-27") {
        dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "username", tableName: "user")
    }
    changeSet(author: "akanksha (generated)", id: "1518061908750-22") {
        dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "seriousness", tableName: "topic")
    }

    changeSet(author: "akanksha (generated)", id: "1518061908750-23") {
        dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "topic_name", tableName: "topic")
    }
    changeSet(author: "akanksha (generated)", id: "1518065986236-22") {
        dropNotNullConstraint(columnDataType: "bigint", columnName: "user_id", tableName: "topic")
    }
    changeSet(author: "akanksha (generated)", id: "1518091588216-21") {
        dropForeignKeyConstraint(baseTableName: "subscription", constraintName: "FK_tq3cq3gmsss8jjyb2l5sb1o6k")

        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "subscription", constraintName: "FK_tq3cq3gmsss8jjyb2l5sb1o6k", referencedColumnNames: "id", referencedTableName: "user")
    }
    changeSet(author: "akanksha (generated)", id: "1518091588216-13") {
        dropForeignKeyConstraint(baseTableName: "subscription", constraintName: "FK_aojatoh2ykivd0ukh09f4mn11")

        addForeignKeyConstraint(baseColumnNames: "topic_id", baseTableName: "subscription", constraintName: "FK_aojatoh2ykivd0ukh09f4mn11", referencedColumnNames: "id", referencedTableName: "topic")
    }
    changeSet(author: "akanksha (generated)", id: "1518092794204-22") {
        dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "seriousness", tableName: "subscription")
    }

    changeSet(author: "akanksha (generated)", id: "1518092794204-23") {
        dropNotNullConstraint(columnDataType: "bigint", columnName: "topic_id", tableName: "subscription")
    }

    changeSet(author: "akanksha (generated)", id: "1518092794204-24") {
        dropNotNullConstraint(columnDataType: "bigint", columnName: "user_id", tableName: "subscription")
    }






}
