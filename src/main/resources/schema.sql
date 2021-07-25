DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS genre;
DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS visitor;

CREATE TABLE genre
(
    id   BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) UNIQUE
);

CREATE TABLE author
(
    id      BIGINT PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(255),
    surname VARCHAR(255),
    UNIQUE (name, surname)
);

CREATE TABLE book
(
    id        BIGINT PRIMARY KEY AUTO_INCREMENT,
    title     VARCHAR(255),
    author_id BIGINT NOT NULL,
    genre_id  BIGINT NOT NULL,
    FOREIGN KEY (author_id) REFERENCES author (id),
    FOREIGN KEY (genre_id) REFERENCES genre (id)
);

CREATE TABLE visitor (
    id        BIGINT PRIMARY KEY AUTO_INCREMENT,
    login     VARCHAR(255),
    password     VARCHAR(255)
);