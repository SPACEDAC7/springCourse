package udemy.spreingboot.webdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.spreingboot.webdemo.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
