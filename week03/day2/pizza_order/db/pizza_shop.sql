-- pizza_shop.sql

DROP TABLE IF EXISTS pizza_orders;

CREATE TABLE pizza_orders (
id SERIAL4 PRIMARY KEY,
first_name VARCHAR(255) NOT NULL,
last_name VARCHAR(255) NOT NULL,
quantity INT2 NOT NULL   CHECK (quantity > 0),
topping VARCHAR(255)
);

-- just to test structure
-- INSERT INTO pizza_orders (first_name, last_name, quantity, topping) VALUES ('Luke', 'Skywalker', 1, 'Napoli');

-- we will be adding to the database using the ruby code, not directly.

SELECT * FROM pizza_orders;

-- pizza_shop.sql
