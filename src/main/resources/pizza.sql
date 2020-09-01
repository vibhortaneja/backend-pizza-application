CREATE SCHEMA pizza;

\dn ---------- To list the schema

CREATE table pizza.pizza_toppings_entity(id BIGSERIAL  PRIMARY KEY, name varchar NOT NULL);

CREATE table pizza.pizza_details_entity(id BIGSERIAL  PRIMARY KEY, name varchar NOT NULL, type varchar NOT NULL , toppingids integer[]);

CREATE table pizza.pizza_price_entity(id BIGSERIAL  PRIMARY KEY, size varchar NOT NULL, price BIGINT NOT NULL, pizzaid BIGINT NOT NULL, FOREIGN KEY(pizzaid) REFERENCES pizza.pizza_details_entity(id));

\dt pizza.* ---------- To list all tables in a schema


