--liquibase formatted sql

--changeset nick:create

create table products (
    id serial,
    name varchar(50),
    description varchar(300)
);
