-- SELECT lightsabers.colour FROM lightsabers;

-- SELECT jedi.*, lightsabers.* FROM jedi
--   INNER JOIN lightsabers
-- ON jedi.id = lightsabers.owner_id;

-- inner join

SELECT jedi.name, lightsabers.colour FROM jedi INNER JOIN lightsabers ON jedi.id = lightsabers.owner_id;



-- left join
-- returns everything in the 'left' table, and associates the entries in the 'right' table with the 'left' table entries based on the condition given.

SELECT jedi.*, lightsabers.* FROM jedi
  LEFT JOIN lightsabers
ON jedi.id = lightsabers.owner_id;

SELECT jedi.*, lightsabers.* FROM lightsabers
  LEFT JOIN jedi
ON jedi.id = lightsabers.owner_id;


-- right join














-- SELECT * FROM table1, table2, table3 WHERE table1.column_a = table2.column_b AND table2.column_d = table3.column_f;
