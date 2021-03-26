-- TODO: Spring Boot can automatically create the schema (DDL scripts) of your DataSource and
--  initialize it (DML scripts). It loads SQL from the standard root classpath locations:
--  schema.sql and data.sql, respectively.

INSERT INTO officers(rank, first_name, last_name) VALUES ('CAPTAIN', 'Jame', 'Kirk');
INSERT INTO officers(rank, first_name, last_name) VALUES ('CAPTAIN', 'David', 'Beck');
INSERT INTO officers(rank, first_name, last_name) VALUES ('CAPTAIN', 'Mary', 'J');
INSERT INTO officers(rank, first_name, last_name) VALUES ('CAPTAIN', 'John', 'Powell');
INSERT INTO officers(rank, first_name, last_name) VALUES ('CAPTAIN', 'Renchi', 'Liu');