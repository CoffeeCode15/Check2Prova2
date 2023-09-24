CREATE TABLE IF NOT EXISTS Cat(
    microchipCode VARCHAR(255) PRIMARY KEY,
    fullName VARCHAR(64),
    nickname VARCHAR(64),
    age INTEGER,
);

INSERT INTO Cat
VALUES ('abcdf', 'pussy', 'pussycat', 3);

SELECT age,
    COUNT (*) AS 'num'
FROM Cat
GROUP BY age;

SELECT *
FROM Cat
WHERE age > 10;

SELECT *
FROM Cat
WHERE nickname = NULL;