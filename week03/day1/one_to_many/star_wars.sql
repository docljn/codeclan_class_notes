-- star_wars.sql

-- runs line by line, unless there is a loop, so instructions are carried out in order.

-- null is sql equivalent for ruby nil

-- all table names are plural
-- columns need to have data type specified
-- sql has functions, just like any other language

DROP TABLE lightsabers;
DROP TABLE jedis;
-- deletes the table before trying to create it
-- means you can make changes to the database structure
-- each time you run the file, you delete, then create

-- CARE: ensure the referring table is dropped before the REFERENCE table as otherwise the reference table will not be deleted on 'drop' unless you add the CASCADE keyword [FIND OUT MORE ABOUT THIS AS I DON'T UNDERSTAND YET]
-- DROP TABLE jedis CASCADE;
-- DROP TABLE lightsabers;

-- CARE: create the REFERENCE table before you try to refer to it.

-- THIS IS THE WHOLE POINT OF SQL - A RELATIONAL DATABASE



--MAKE A TABLE

-- CARE
-- We need a unique identifier to ensure that each row is able to be selected individually: id
-- in order to ensure it's unique, we use a datatype which increments an integer each time it is used: SERIAL [defaults to SERIAL4]
-- to ensure it is unique you can use the keyword UNIQUE, but this isn't enough.
-- id needs to be unique, not null: PRIMARY KEY : keyword defining the most important column in the table - the one to which everything else refers.
-- a table can only have one PRIMARY KEY

CREATE TABLE jedis (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  age INT, --[INT2, INT4, INT8 = number of bytes used to store, defaults to INT8 if INT specified]
  darkside BOOLEAN
);

-- When you set up a table, you can set fields to be required e.g. cannot be null [called a constraint] NOT NULL
CREATE TABLE lightsabers(
  id SERIAL PRIMARY KEY,
  colour VARCHAR(255),
  hilt_metal VARCHAR(255) NOT NULL,
  -- owner VARCHAR(255)
  owner_id INT REFERENCES jedis(id)
  -- convention for reference to the id of another table
  -- REFERENCES tablename(column): constrain to an id that actually exists in the jedis table
  -- the (column) is then known as a FOREIGN KEY in relation to the jedis table
  -- 
  -- this is a one-to-many relation as each lightsaber must belong to a jedi, but a jedi can have more than one lightsaber

  -- *************************
  -- CARE: once one table uses another as a reference, you CANNOT DROP the reference table as long as the referring table exists.
);



--CREATE

-- add a row of data to table - column headings, values - must be listed in same order in INSERT section
-- VARCHAR must be SINGLE QUOTES
INSERT INTO jedis (name, age, darkside) VALUES ('luke', 22, false);

--INSERT - part of create
INSERT INTO jedis (name, darkside) VALUES ('yoda', false);



--READ

SELECT * FROM jedis; --select all

SELECT name FROM jedis; --only the name field

SELECT COUNT(*) FROM jedis; --how many records, count(column_name)

SELECT COUNT(age) FROM jedis;



--UPDATE
-- jedis table
UPDATE jedis SET darkside = true;  --changes all records, as just column specified

-- where is like ruby guard statement
-- can use keyword AND to check more than one condition
-- CARE: = is for assignment and equality, depending on context
UPDATE jedis SET darkside = false WHERE name = 'yoda' AND darkside = true;

--class task:
-- Add a new jedi "Anakin" with age 12 and darkside set to false.
-- Update anakin to be age 22
-- Update anakin's darkside to be true

INSERT INTO jedis (name, age, darkside) VALUES ('anakin', 12, false);

-- first way
UPDATE jedis SET darkside = true WHERE name = 'anakin';
UPDATE jedis SET age = 22 WHERE name = 'anakin';

-- what if we want to set two things at once?
-- second way:
UPDATE jedis SET age = 22, darkside = true WHERE name = 'anakin';
-- third way:
UPDATE jedis SET (age, darkside) = (22, true) WHERE name = 'anakin';

SELECT * FROM jedis; --select all to see what has been changed


-- lightsabers table

   -- original method when we used 'owner'
-- INSERT INTO lightsabers
-- ( colour, hilt_metal, owner)
-- VALUES
-- ('green', 'stainless steel', 'yoda');
--
-- INSERT INTO lightsabers (colour, owner, hilt_metal) VALUES ('blue', 'luke', 'gold');
--
-- -- UPDATE lightsabers SET id = 50; - you could do this, if you had not contstrained id to be PRIMARY KEY

INSERT INTO lightsabers (colour, hilt_metal, owner_id) VALUES ('green', 'gold', 2);

-- DELETE
-- no need to specify an option, as you delete the entire record from the table
-- if you want to delete just one item, set it to null instead
-- DELETE FROM jedis; -- deletes e-v-e-r-y-t-h-i-n-g
DELETE FROM jedis  WHERE name = 'luke';


SELECT * FROM jedis; --select all to see what has been changed
SELECT * FROM lightsabers;


-- To delete the whole table: DROP TABLE tablename;
