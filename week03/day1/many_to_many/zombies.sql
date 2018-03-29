-- zombies.sql
DROP TABLE bitings;
DROP TABLE zombies;
DROP TABLE victims;


-- you can't have one reference and one referring if you want a many-to-many
-- make a third table which provides the link between the two reference tables
-- this is a foreign-key table
-- must be dropped first, and created last as it references the two other tables.



CREATE TABLE zombies
(
    id SERIAL8 PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(255)
);


CREATE TABLE victims
(
  id SERIAL8 PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  runspeed INT2
);


CREATE TABLE bitings
(
  id SERIAL8 PRIMARY KEY,
  victim_id INT8 REFERENCES victims(id),
  zombie_id INT8 REFERENCES zombies(id),
  infected_on DATE NOT NULL
);



INSERT INTO victims (name, runspeed) VALUES ('Tony', 12);
INSERT INTO victims (name, runspeed) VALUES ('Jarrod', 11);
INSERT INTO victims (name, runspeed) VALUES ('Darren', 15);
INSERT INTO victims (name, runspeed) VALUES ('Keith', 30);


INSERT INTO zombies (name, type) VALUES ('John', 'crawler');
INSERT INTO zombies (name, type) VALUES ('Alex', 'runner');
INSERT INTO zombies (name, type) VALUES ('Zsolt', 'witch');
INSERT INTO zombies (name, type) VALUES ('Craig', 'tank');



-- create associations between the tables
INSERT INTO bitings (zombie_id, victim_id, infected_on) VALUES (1, 1, 'October 31 2017');
INSERT INTO bitings (zombie_id, victim_id, infected_on) VALUES (2, 2, 'November 04 2017');
INSERT INTO bitings (zombie_id, victim_id, infected_on) VALUES (4, 3, 'November 14 2017');


INSERT INTO bitings (zombie_id, victim_id, infected_on) VALUES (1, 3, 'November 14 2017');

SELECT * FROM zombies WHERE name = 'John';

-- finding victim ids of people bitten by John
SELECT victim_id FROM bitings WHERE zombie_id = 1;

-- finding names of people bitten by John
SELECT name FROM victims WHERE id IN (1,3)
-- IN keyword allows you to select more than one using a set















 -- SELECT * FROM zombies;
 -- SELECT * FROM victims;
