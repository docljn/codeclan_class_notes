-- football_squads.sql
-- 
-- This is an example of what @Eric was asking about. Where you can use two foreign keys as a primary key. (AKA composite primary key). Just for interest - you don't need to know this just now.

DROP TABLE IF EXISTS squads;
DROP TABLE IF EXISTS players;
DROP TABLE IF EXISTS teams;

CREATE TABLE players (
  id SERIAL4 PRIMARY KEY,
  name VARCHAR
);

CREATE TABLE teams (
  id SERIAL4 PRIMARY KEY,
  name VARCHAR
);

CREATE TABLE squads (
  player_id INT4 REFERENCES players(id) ON DELETE CASCADE,
  team_id INT4 REFERENCES teams(id) ON DELETE CASCADE,
  PRIMARY KEY( player_id, team_id )
);

INSERT INTO players (name) VALUES ('Lionel Messi');
INSERT INTO players (name) VALUES ('Luis Suarez');
INSERT INTO teams (name) VALUES ('Barcelona');
INSERT INTO teams (name) VALUES ('Argentina');
INSERT INTO teams (name) VALUES ('Uruguay');


INSERT INTO squads(player_id, team_id) VALUES (1,2); -- Messi -> Argentina
INSERT INTO squads(player_id, team_id) VALUES (1,1); -- Messi -> Barcelona
INSERT INTO squads(player_id, team_id) VALUES (2,1); -- Suarez -> Barcelona
INSERT INTO squads(player_id, team_id) VALUES (2,3); -- Suarez -> Uruguay

-- Messi can't be in the Argentina squad twice (at same time) - error - duplicate key value violates unique constraint "lineups_pkey"
INSERT INTO squads(player_id, team_id) VALUES (1,1);

-- get Team rosters -
SELECT teams.name, players.name FROM players
INNER JOIN squads ON players.id = squads.player_id
INNER JOIN teams ON squads.team_id = teams.id;
