package ru.otus.istyazhkina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.otus.istyazhkina.domain.Author;

import java.util.List;

@RepositoryRestResource(path = "author")
public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findAll();

    @RestResource(path = "names", rel = "name")
    List<Author> findByName(String name);

    @RestResource(path = "surnames", rel = "surname")
    List<Author> findBySurname(String surname);
}
