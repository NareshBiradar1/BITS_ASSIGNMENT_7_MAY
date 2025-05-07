package com.sst.bits.service;

import com.sst.bits.entity.Author;
import com.sst.bits.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class AuthorService {
    
    @Autowired
    private AuthorRepository authorRepository;
    
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }
    
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Author not found with id: " + id));
    }
    
    public Author getAuthorWithBooks(Long id) {
        return authorRepository.findByIdWithBooks(id);
    }
    
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
    
    public List<Author> searchAuthorsByName(String name) {
        return authorRepository.findByNameContainingIgnoreCase(name);
    }
    
    public Author updateAuthor(Long id, Author authorDetails) {
        Author author = getAuthorById(id);
        author.setName(authorDetails.getName());
        author.setEmail(authorDetails.getEmail());
        author.setBiography(authorDetails.getBiography());
        return authorRepository.save(author);
    }
} 