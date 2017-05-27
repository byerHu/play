# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bill (
  bill_id                   integer auto_increment not null,
  commodity_id              integer,
  number                    integer,
  money                     double,
  user                      varchar(255),
  time                      datetime,
  constraint pk_bill primary key (bill_id))
;

create table cart (
  cart_id                   integer auto_increment not null,
  commodity_id              integer,
  number                    integer,
  user                      varchar(255),
  constraint pk_cart primary key (cart_id))
;

create table checkstore (
  check_id                  integer auto_increment not null,
  storename                 varchar(255),
  user                      varchar(255),
  description               varchar(255),
  constraint pk_checkstore primary key (check_id))
;

create table comment (
  comment_id                integer auto_increment not null,
  commodity_id              integer,
  user                      varchar(255),
  content                   varchar(255),
  time                      datetime,
  constraint pk_comment primary key (comment_id))
;

create table commodity (
  commodity_id              integer auto_increment not null,
  commodity_name            varchar(255),
  price                     double,
  agio                      double,
  c_type                    varchar(255),
  user                      varchar(255),
  time                      datetime,
  constraint pk_commodity primary key (commodity_id))
;

create table paper (
  issueid                   integer auto_increment not null,
  title                     varchar(255),
  author                    varchar(255),
  content                   varchar(255),
  time                      datetime,
  constraint pk_paper primary key (issueid))
;

create table store (
  store_id                  integer auto_increment not null,
  storename                 varchar(255),
  user                      varchar(255),
  description               varchar(255),
  time                      datetime,
  constraint pk_store primary key (store_id))
;

create table user (
  id                        integer auto_increment not null,
  username                  varchar(255),
  password                  varchar(255),
  powerid                   integer,
  constraint pk_user primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table bill;

drop table cart;

drop table checkstore;

drop table comment;

drop table commodity;

drop table paper;

drop table store;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

