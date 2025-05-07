package com.sst.bits.controller;

import com.sst.bits.entity.Author;
import com.sst.bits.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    
    @Autowired
    private AuthorService authorService;
    
    @GetMapping
    public String listAuthors(Model model) {
        model.addAttribute("authors", authorService.getAllAuthors());
        return "author/list";
    }
    
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("author", new Author());
        return "author/form";
    }
    
    @PostMapping
    public String createAuthor(@ModelAttribute Author author, RedirectAttributes redirectAttributes) {
        try {
            authorService.saveAuthor(author);
            redirectAttributes.addFlashAttribute("success", "Author created successfully!");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error creating author: " + e.getMessage());
        }
        return "redirect:/authors";
    }
    
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("author", authorService.getAuthorById(id));
        return "author/form";
    }
    
    @PostMapping("/{id}")
    public String updateAuthor(@PathVariable Long id, @ModelAttribute Author author, 
                             RedirectAttributes redirectAttributes) {
        try {
            authorService.updateAuthor(id, author);
            redirectAttributes.addFlashAttribute("success", "Author updated successfully!");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error updating author: " + e.getMessage());
        }
        return "redirect:/authors";
    }
    
    @GetMapping("/{id}/books")
    public String showAuthorBooks(@PathVariable Long id, Model model) {
        model.addAttribute("author", authorService.getAuthorWithBooks(id));
        return "author/books";
    }
} 