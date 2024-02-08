CREATE DATABASE IF NOT EXISTS dockerexample;
USE dockerexample;
CREATE TABLE IF NOT EXISTS dockerexample_table(id int, title varchar(20));
INSERT INTO dockerexample_table(id, title) VALUES(1, 'Docker Example');