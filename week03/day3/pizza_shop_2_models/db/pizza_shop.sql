DROP TABLE IF EXISTS pizza_orders;

-- create the customers table first, as the orders table refers to it.

DROP TABLE IF EXISTS pizza_orders;
DROP TABLE IF EXISTS customers;
-- always drop the referring table before the reference table

CREATE TABLE customers (
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  id SERIAL4 PRIMARY KEY
);

CREATE TABLE pizza_orders (
  id SERIAL4 PRIMARY KEY,
  quantity INT2,
  topping VARCHAR(255),
  customer_id INT4 REFERENCES customers(id)
  -- match the data type of the reference and referring field
);
