create database warehouse;

CREATE SEQUENCE warehouse_seq
  INCREMENT 1
  MINVALUE 1
  START 10000000
  CACHE 1;

create table warehouse_items (
  item_id text not null DEFAULT nextval('warehouse_seq'),
  item_name text not null,
  quantity integer default 1,
  created_date timestamp without time zone NOT NULL DEFAULT now(),
  updated_date timestamp without time zone NOT NULL DEFAULT now(),
  constraint pk_warehouse_items primary key (item_id)
);

insert into warehouse_items (item_name, quantity) values ('item 1','1000');
insert into warehouse_items (item_name, quantity) values ('item 2','1000');
insert into warehouse_items (item_name, quantity) values ('item 3','1000');
insert into warehouse_items (item_name, quantity) values ('item 4','1000');
insert into warehouse_items (item_name, quantity) values ('item 5','1000');
insert into warehouse_items (item_name, quantity) values ('item 6','1000');
insert into warehouse_items (item_name, quantity) values ('item 7','1000');
insert into warehouse_items (item_name, quantity) values ('item 8','1000');
insert into warehouse_items (item_name, quantity) values ('item 9','1000');
insert into warehouse_items (item_name, quantity) values ('item 10','1000');