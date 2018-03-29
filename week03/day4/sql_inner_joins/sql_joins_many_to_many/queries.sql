-- now got three tables

SELECT victims.name, zombies.name, bitings.infected_on FROM victims
INNER JOIN bitings -- CREATES A NEW EPHEMERAL TABLE from victims + bitings
  ON bitings.victim_id = victims.id
INNER JOIN zombies
  ON zombies.id = bitings.zombie_id;

-- this won't work if you inner join zombies first, as you need to link victims to zombies via bitings.

























-- SELECT * FROM table1, table2, table3 WHERE table1.column_a = table2.column_b AND table2.column_d = table3.column_f;
