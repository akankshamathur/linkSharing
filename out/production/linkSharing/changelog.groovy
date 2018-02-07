databaseChangeLog = {

    changeSet(author: "akanksha (generated)", id: "1517916435009-1") {
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
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-2") {
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

            column(name: "class", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "url", type: "VARCHAR(255)")

            column(name: "file_path", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-3") {
        createTable(tableName: "resource_rating") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "resource_ratingPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "score", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-4") {
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

    changeSet(author: "akanksha (generated)", id: "1517916435009-5") {
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

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "seriousness", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-6") {
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

            column(name: "topic_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-7") {
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

            column(name: "enabled", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "password", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "password_expired", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "username", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-8") {
        createTable(tableName: "user_role") {
            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "role_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-9") {
        addPrimaryKey(columnNames: "user_id, role_id", constraintName: "user_rolePK", tableName: "user_role")
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-10") {
        addUniqueConstraint(columnNames: "authority", constraintName: "UC_ROLEAUTHORITY_COL", tableName: "role")
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-11") {
        addUniqueConstraint(columnNames: "username", constraintName: "UC_USERUSERNAME_COL", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-12") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK_apcc8lxk2xnug8377fatvbn04", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517916435009-13") {
        addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK_it77eq964jhfqtu54081ebtio", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role")
    }
    changeSet(author: "akanksha (generated)", id: "1517916660508-1") {
        addColumn(tableName: "user") {
            column(name: "first_name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }
    changeSet(author: "akanksha (generated)", id: "1517922702537-1") {
        createTable(tableName: "topic_subscription") {
            column(name: "topic_subscriptions_id", type: "BIGINT")

            column(name: "subscription_id", type: "BIGINT")
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-2") {
        createTable(tableName: "user_subscription") {
            column(name: "user_subscriptions_id", type: "BIGINT")

            column(name: "subscription_id", type: "BIGINT")
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-3") {
        addColumn(tableName: "user") {
            column(name: "admin", type: "bit") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-4") {
        addColumn(tableName: "user") {
            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-5") {
        addColumn(tableName: "user") {
            column(name: "email_id", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-6") {
        addColumn(tableName: "user") {
            column(name: "last_name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-7") {
        addColumn(tableName: "user") {
            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-8") {
        addColumn(tableName: "user") {
            column(name: "photo", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-9") {
        addColumn(tableName: "reading_item") {
            column(name: "resources_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-10") {
        addColumn(tableName: "resource_rating") {
            column(name: "resources_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-11") {
        addColumn(tableName: "topic") {
            column(name: "seriousness", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-12") {
        addColumn(tableName: "resource") {
            column(name: "topics_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-13") {
        addColumn(tableName: "reading_item") {
            column(name: "users_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-14") {
        addColumn(tableName: "resource") {
            column(name: "users_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-15") {
        addColumn(tableName: "resource_rating") {
            column(name: "users_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-16") {
        addColumn(tableName: "topic") {
            column(name: "users_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-17") {
        addUniqueConstraint(columnNames: "email_id", constraintName: "UC_USEREMAIL_ID_COL", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-18") {
        addForeignKeyConstraint(baseColumnNames: "resources_id", baseTableName: "reading_item", constraintName: "FK_a657fs4kyluytmrva54824lty", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-19") {
        addForeignKeyConstraint(baseColumnNames: "users_id", baseTableName: "topic", constraintName: "FK_eh4v72swxn6od4nl02d2huu78", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-20") {
        addForeignKeyConstraint(baseColumnNames: "subscription_id", baseTableName: "user_subscription", constraintName: "FK_f0dcjs55auqkgcbex3am6f4b7", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "subscription")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-21") {
        addForeignKeyConstraint(baseColumnNames: "subscription_id", baseTableName: "topic_subscription", constraintName: "FK_fkmfvxg95iyics3mp7tcmo18w", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "subscription")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-22") {
        addForeignKeyConstraint(baseColumnNames: "topics_id", baseTableName: "resource", constraintName: "FK_fs6rn7ke2wmcyah2sjpidgyxl", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "topic")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-23") {
        addForeignKeyConstraint(baseColumnNames: "users_id", baseTableName: "reading_item", constraintName: "FK_hs3nqkr6g6337tijc82bn7nnv", deferrable:                                                                                                                                      "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-24") {
        addForeignKeyConstraint(baseColumnNames: "users_id", baseTableName: "resource", constraintName: "FK_ijl604ox0i2861stw84nrqx6h", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-25") {
        addForeignKeyConstraint(baseColumnNames: "users_id", baseTableName: "resource_rating", constraintName: "FK_j05t79wu8kvni4c306a58v0q0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-26") {
        addForeignKeyConstraint(baseColumnNames: "user_subscriptions_id", baseTableName: "user_subscription", constraintName: "FK_mj594s4qubustx53049g1cwln", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-27") {
        addForeignKeyConstraint(baseColumnNames: "topic_subscriptions_id", baseTableName: "topic_subscription", constraintName: "FK_sprh51uahn3qpojecrc2fd6vn", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "topic")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-28") {
        addForeignKeyConstraint(baseColumnNames: "resources_id", baseTableName: "resource_rating", constraintName: "FK_tdr83k5fwq26uvwvagufj614i", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "resource")
    }

    changeSet(author: "akanksha (generated)", id: "1517922702537-29") {
        dropColumn(columnName: "last_updated", tableName: "subscription")
    }



}
