-- MY QUESTIONS:
-- 1. The results from an sql search don't appear to be sorted by default, is that right?

-- 1. Return ALL the data in the 'movies' table.

SELECT * FROM movies;
--  id |                title                | year | show_time
-- ----+-------------------------------------+------+-----------
--   1 | Iron Man                            | 2008 | 17:30
--   2 | The Incredible Hulk                 | 2008 | 17:10
--   3 | Iron Man 2                          | 2010 | 20:05
--   4 | Thor                                | 2011 | 21:05
--   5 | Captain America: The First Avenger  | 2011 | 12:05
--   6 | Avengers Assemble                   | 2012 | 13:05
--   7 | Iron Man 3                          | 2013 | 22:00
--   8 | Thor: The Dark World                | 2013 | 19:30
--   9 | Batman Begins                       | 2005 | 14:25
--  10 | Captain America: The Winter Soldier | 2014 | 20:15
--  11 | Guardians of the Galaxy             | 2014 | 17:55
--  12 | Avengers: Age of Ultron             | 2015 | 21:10
--  13 | Ant-Man                             | 2015 | 20:40
--  14 | Captain America: Civil War          | 2016 | 13:50
--  15 | Doctor Strange                      | 2016 | 21:30
--  16 | Guardians of the Galaxy 2           | 2017 | 15:50


--
-- 2. Return ONLY the name column from the 'people' table

SELECT name FROM people;

-- name
-- -------------------
-- Dave Ellis
-- Joe Ryan
-- Richard Allison
-- Alison Wood
-- Olga Maunsell
-- Graeme Brown
-- Eric Carles
-- David Rawson
-- Ross Hill
-- Mark Blanford
-- Douglas Sangster
-- Giuseppe Ibba
-- Kris Anderson
-- Vishal Sharma
-- Manny Chita
-- Amy Morrison
-- Joe Plevin
-- Robert Henderson
-- Max Robson
-- Lorna Nobel-Prize
-- Alex Bazlinton

-- 3. Oops! Someone at CodeClan spelled Lorna's name wrong! Change it to reflect the proper spelling (Noble)

UPDATE people SET name = 'Lorna Noble' WHERE name = 'Lorna Nobel-Prize';

-- UPDATE 1

-- 4. Return ONLY your name from the 'people' table.

SELECT name FROM people WHERE id = 20;

--     name
-- -------------
--  Lorna Noble

-- 5. The cinema is showing 'Batman Begins', but Batman is DC, not Marvel! Delete the entry from the 'movies' table.

DELETE FROM movies WHERE id = 9;

-- DELETE 1

-- 6. Create a new entry in the 'people' table with the name of one of the instructors

INSERT INTO people (name) VALUES ('Zsolt Podoba-Szalai');

-- INSERT 0 1

-- 7. Alex has decided to hijack our movie evening, Remove him from the table of people.

DELETE FROM people WHERE id = 21;

-- DELETE 1

-- 8. The cinema has just heard that they will be holding an exclusive midnight showing of 'Guardians of the Galaxy 2'!! Create a new entry in the 'movies' table to reflect this.

INSERT INTO movies (title, year, show_time) VALUES ('Guardians of the Galaxy 2', 2017, '00:00');

-- INSERT 0 1


-- 9. The cinema would also like to make the Guardian movies a back to back feature. Update the 'Guardians of the Galaxy' show time from 17:55 to 21:30

UPDATE movies SET show_time = '21:30' WHERE title = 'Guardians of the Galaxy' AND show_time = '17:55';

-- UPDATE 1

-- ## Extension
--
-- 1. Research how to delete multiple entries from your table in a single command.

DELETE FROM table WHERE table_column_name IN (entry1, entry2, entry3)

DELETE FROM table WHERE table_column_name = first_value OR table_column_name = last_value;

DELETE FROM table WHERE table_column_name BETWEEN bottom_value AND top_value

DELETE FROM table WHERE table_column_name >= a_value AND table_column_name <= another_value
-- CARE: the column must be the same in both cases for this method.
