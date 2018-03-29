DROP TABLE IF EXISTS visits;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS locations;

CREATE TABLE users (
  id SERIAL4 PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE locations (
  id SERIAL4 PRIMARY KEY,
  category VARCHAR(255),
  name VARCHAR(255)
);

-- make the joining table
-- both users and locations are referenced in visits
-- thus visits must be dropped first
-- visits must be created last

CREATE TABLE visits (
  id SERIAL4 PRIMARY KEY,
  user_id INT4 REFERENCES users(id) ON DELETE CASCADE,
  location_id INT4 REFERENCES locations(id) ON DELETE CASCADE,
  review TEXT
);

-- ON DELETE CASCADE
-- every time a user is deleted, look for any visits which reference that specific user(id) and delete all those visits.
