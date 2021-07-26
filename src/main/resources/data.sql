INSERT INTO genre (`name`) VALUES ('novel'), ('fantasy'), ('poetry');
INSERT INTO author (`name`, `surname`) VALUES ('Lev', 'Tolstoy'), ('Joseph', 'Brodskiy'), ('John', 'Tolkien');
INSERT INTO book (`title`, `author_id`, `genre_id`) VALUES ('War and Peace', 1, 1), ('Rozhdestvenskie stikhi', 2, 3), ('The Hobbit', 3, 2);