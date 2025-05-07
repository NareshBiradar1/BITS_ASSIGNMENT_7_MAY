package com.sst.bits.repository;

import com.sst.bits.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);
    
    List<Book> findByAuthorId(Long authorId);
    
    @Query("SELECT b FROM Book b JOIN FETCH b.author WHERE b.id = :id")
    Book findByIdWithAuthor(Long id);
    
    @Query("SELECT b FROM Book b JOIN FETCH b.author")
    List<Book> findAllWithAuthors();
} 