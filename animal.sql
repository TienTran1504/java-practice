-- Create the database
CREATE DATABASE animal;

-- Switch to the animal database
USE animal;

-- Create the dogs table
CREATE TABLE dogs (
    id INT PRIMARY KEY,
    name VARCHAR(255)
);

-- Create the cats table
CREATE TABLE cats (
    id INT PRIMARY KEY,
    name VARCHAR(255)
);

-- Insert example values into dogs table
INSERT INTO dogs (id, name) VALUES (1, 'Buddy');
INSERT INTO dogs (id, name) VALUES (2, 'Max');
INSERT INTO dogs (id, name) VALUES (3, 'Bella');
INSERT INTO dogs (id, name) VALUES (4, 'Charlie');

-- Insert example values into cats table
INSERT INTO cats (id, name) VALUES (1, 'Whiskers');
INSERT INTO cats (id, name) VALUES (2, 'Luna');
INSERT INTO cats (id, name) VALUES (3, 'Mittens');
INSERT INTO cats (id, name) VALUES (4, 'Shadow');
