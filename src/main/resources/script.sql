CREATE DATABASE sample;
USE sample;
CREATE TABLE users (name VARCHAR(255), login VARCHAR(255),
    password VARCHAR(255), email VARCHAR(20));


insert into users (name, login, password, email ) values ('Juan Lopez', 'admin',  'admin', 'admin@test.com');
insert into users (name, login, password, email ) values ('Ana Londo', 'admin',  'ana', 'ana@test.com');
insert into users (name, login, password, email ) values ('Pedro Rendon', 'admin',  'pedro', 'pedro@test.com');
insert into users (name, login, password, email ) values ('Paco Medina', 'admin',  'paco', 'paco@test.com');
insert into users (name, login, password, email ) values ('Elena Alba', 'admin',  'elena', 'elena@test.com');
insert into users (name, login, password, email ) values ('Marta Madrid', 'admin',  'marta', 'marta@test.com');

#select name, login, password, email from users where login = ? and password = ?
#select * from users
