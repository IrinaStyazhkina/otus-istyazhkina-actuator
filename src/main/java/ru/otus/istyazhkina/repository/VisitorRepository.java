package ru.otus.istyazhkina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.otus.istyazhkina.domain.Visitor;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "visitor")
public interface VisitorRepository extends JpaRepository<Visitor, Long> {

    List<Visitor> findAll();

    @RestResource(path = "logins", rel = "login")
    Optional<Visitor> findByLogin(String login);

}
