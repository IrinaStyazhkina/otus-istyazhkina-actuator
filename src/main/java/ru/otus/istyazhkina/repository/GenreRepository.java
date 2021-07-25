package ru.otus.istyazhkina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.otus.istyazhkina.domain.Genre;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "genre")
public interface GenreRepository extends JpaRepository<Genre, Long> {

    List<Genre> findAll();

    @RestResource(path = "names", rel = "name")
    Optional<Genre> findByName(String name);
}
