package ru.otus.istyazhkina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.otus.istyazhkina.domain.Book;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "book")
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    @RestResource(path = "titles", rel = "title")
    Optional<Book> findByTitle(String title);
}
