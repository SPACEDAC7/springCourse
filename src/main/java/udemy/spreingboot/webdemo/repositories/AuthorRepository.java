package udemy.spreingboot.webdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.spreingboot.webdemo.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
