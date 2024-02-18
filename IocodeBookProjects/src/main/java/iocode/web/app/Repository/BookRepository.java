package iocode.web.app.Repository;

import org.springframework.data.repository.CrudRepository;

import iocode.web.app.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
