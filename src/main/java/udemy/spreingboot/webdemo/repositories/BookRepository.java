package udemy.spreingboot.webdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.spreingboot.webdemo.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
