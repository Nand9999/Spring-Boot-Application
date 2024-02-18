package iocode.web.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import iocode.web.app.entity.Author;


@RepositoryRestResource
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
