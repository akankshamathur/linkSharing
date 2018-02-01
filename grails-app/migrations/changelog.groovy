databaseChangeLog = {

    changeSet(author: "akanksha (generated)", id: "1517488891404-1") {
        createTable(tableName: "role") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "authority", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517488891404-2") {
        createTable(tableName: "user") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "account_expired", type: "BIT(1)") {
                constraints(nullable: "false")
            }

            column(name: "account_locked", type: "BIT(1)") {
                constraints(nullable: "false")
            }

            column(name: "enabled", type: "BIT(1)") {
                constraints(nullable: "false")
            }

            column(name: "password", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "password_expired", type: "BIT(1)") {
                constraints(nullable: "false")
            }

            column(name: "username", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517488891404-3") {
        createTable(tableName: "user_role") {
            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "role_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }


    changeSet(author: "akanksha (generated)", id: "1517488891404-5") {
        addUniqueConstraint(columnNames: "authority", constraintName: "UK_irsamgnera6angm0prq1kemt2", tableName: "role")
    }

    changeSet(author: "akanksha (generated)", id: "1517488891404-6") {
        addUniqueConstraint(columnNames: "username", constraintName: "UK_sb8bbouer5wak8vyiiy4pf2bx", tableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517488891404-7") {
        createIndex(indexName: "FK_it77eq964jhfqtu54081ebtio", tableName: "user_role") {
            column(name: "role_id")
        }
    }

    changeSet(author: "akanksha (generated)", id: "1517488891404-8") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK_apcc8lxk2xnug8377fatvbn04", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "akanksha (generated)", id: "1517488891404-9") {
        addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK_it77eq964jhfqtu54081ebtio", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "role")
    }
}
