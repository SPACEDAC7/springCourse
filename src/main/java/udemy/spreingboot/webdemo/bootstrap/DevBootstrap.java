package udemy.spreingboot.webdemo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import udemy.spreingboot.webdemo.model.Author;
import udemy.spreingboot.webdemo.model.Book;
import udemy.spreingboot.webdemo.model.Publisher;
import udemy.spreingboot.webdemo.repositories.AuthorRepository;
import udemy.spreingboot.webdemo.repositories.BookRepository;
import udemy.spreingboot.webdemo.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){

        Author drew = new Author("Drew", "Dumbledore");
        Publisher litus = new Publisher("Litus Bondermiller", "False Street 123");
        Book drewBook = new Book("Magic Basis 1", "IS12341254");
        drew.getBooks().add(drewBook);
        drewBook.setPublisher(litus);
        drewBook.getAuthors().add(drew);

        authorRepository.save(drew);
        publisherRepository.save(litus);
        bookRepository.save(drewBook);

        Author eli = new Author("Elien", "Degenered");
        Publisher phil = new Publisher( "Phil Adelfia", "Square Garden 45");
        Book eliBook = new Book("Late Night Monologues", "IS7807689745");
        eli.getBooks().add(eliBook);
        eliBook.setPublisher(phil);
        eliBook.getAuthors().add(eli);

        authorRepository.save(eli);
        publisherRepository.save(phil);
        bookRepository.save(eliBook);

    }
}
