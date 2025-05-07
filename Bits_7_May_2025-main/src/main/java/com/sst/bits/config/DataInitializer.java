package com.sst.bits.config;

import com.sst.bits.entity.Author;
import com.sst.bits.entity.Book;
import com.sst.bits.repository.AuthorRepository;
import com.sst.bits.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) {
        // Create authors
        Author author1 = new Author();
        author1.setName("J.K. Rowling");
        author1.setEmail("jkrowling@example.com");
        author1.setBiography("British author best known for the Harry Potter series.");

        Author author2 = new Author();
        author2.setName("George R.R. Martin");
        author2.setEmail("grrmartin@example.com");
        author2.setBiography("American novelist and short story writer, best known for A Song of Ice and Fire series.");

        Author author3 = new Author();
        author3.setName("Stephen King");
        author3.setEmail("sking@example.com");
        author3.setBiography("American author of horror, supernatural fiction, suspense, and fantasy novels.");

        Author author4 = new Author();
        author4.setName("Agatha Christie");
        author4.setEmail("achristie@example.com");
        author4.setBiography("English writer known for her detective novels.");

        Author author5 = new Author();
        author5.setName("Ernest Hemingway");
        author5.setEmail("ehemingway@example.com");
        author5.setBiography("American novelist, short story writer, and journalist.");

        authorRepository.saveAll(Arrays.asList(author1, author2, author3, author4, author5));

        // Create books
        Book book1 = new Book();
        book1.setTitle("Harry Potter and the Philosopher's Stone");
        book1.setIsbn("978-0747532743");
        book1.setDescription("The first book in the Harry Potter series.");
        book1.setPrice(new BigDecimal("19.99"));
        book1.setPublicationDate(LocalDate.of(1997, 6, 26));
        book1.setAuthor(author1);

        Book book2 = new Book();
        book2.setTitle("A Game of Thrones");
        book2.setIsbn("978-0553103540");
        book2.setDescription("The first book in A Song of Ice and Fire series.");
        book2.setPrice(new BigDecimal("24.99"));
        book2.setPublicationDate(LocalDate.of(1996, 8, 1));
        book2.setAuthor(author2);

        Book book3 = new Book();
        book3.setTitle("The Shining");
        book3.setIsbn("978-0385121675");
        book3.setDescription("A horror novel by Stephen King.");
        book3.setPrice(new BigDecimal("14.99"));
        book3.setPublicationDate(LocalDate.of(1977, 1, 28));
        book3.setAuthor(author3);

        Book book4 = new Book();
        book4.setTitle("Murder on the Orient Express");
        book4.setIsbn("978-0062073495");
        book4.setDescription("A detective novel featuring Hercule Poirot.");
        book4.setPrice(new BigDecimal("12.99"));
        book4.setPublicationDate(LocalDate.of(1934, 1, 1));
        book4.setAuthor(author4);

        Book book5 = new Book();
        book5.setTitle("The Old Man and the Sea");
        book5.setIsbn("978-0684801223");
        book5.setDescription("A novel about an aging fisherman's struggle with a giant marlin.");
        book5.setPrice(new BigDecimal("9.99"));
        book5.setPublicationDate(LocalDate.of(1952, 9, 1));
        book5.setAuthor(author5);

        Book book6 = new Book();
        book6.setTitle("Harry Potter and the Chamber of Secrets");
        book6.setIsbn("978-0747538493");
        book6.setDescription("The second book in the Harry Potter series.");
        book6.setPrice(new BigDecimal("19.99"));
        book6.setPublicationDate(LocalDate.of(1998, 7, 2));
        book6.setAuthor(author1);

        Book book7 = new Book();
        book7.setTitle("A Clash of Kings");
        book7.setIsbn("978-0553108033");
        book7.setDescription("The second book in A Song of Ice and Fire series.");
        book7.setPrice(new BigDecimal("24.99"));
        book7.setPublicationDate(LocalDate.of(1998, 11, 16));
        book7.setAuthor(author2);

        Book book8 = new Book();
        book8.setTitle("It");
        book8.setIsbn("978-0450411434");
        book8.setDescription("A horror novel about a shape-shifting monster.");
        book8.setPrice(new BigDecimal("16.99"));
        book8.setPublicationDate(LocalDate.of(1986, 9, 15));
        book8.setAuthor(author3);

        Book book9 = new Book();
        book9.setTitle("Death on the Nile");
        book9.setIsbn("978-0062073600");
        book9.setDescription("A detective novel featuring Hercule Poirot.");
        book9.setPrice(new BigDecimal("12.99"));
        book9.setPublicationDate(LocalDate.of(1937, 11, 1));
        book9.setAuthor(author4);

        Book book10 = new Book();
        book10.setTitle("For Whom the Bell Tolls");
        book10.setIsbn("978-0684803357");
        book10.setDescription("A novel set during the Spanish Civil War.");
        book10.setPrice(new BigDecimal("11.99"));
        book10.setPublicationDate(LocalDate.of(1940, 10, 21));
        book10.setAuthor(author5);

        bookRepository.saveAll(Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10));
    }
} 