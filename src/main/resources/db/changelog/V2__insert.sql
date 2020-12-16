--liquibase formatted sql

--changeset nick:insert

insert into products(name, description) values ('milky', 'milk product'), ('fruity', 'fruit product'),
                                               ('nutty', 'nut product');