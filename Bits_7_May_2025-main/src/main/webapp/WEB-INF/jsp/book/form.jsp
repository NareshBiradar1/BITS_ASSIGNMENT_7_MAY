<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="form-container">
    <h2>${book.id == null ? 'Add New Book' : 'Edit Book'}</h2>
    
    <form action="${book.id == null ? '/books' : '/books/' + book.id}" method="post">
        <div class="mb-3">
            <label for="title" class="form-label">Title</label>
            <input type="text" class="form-control" id="title" name="title" value="${book.title}" required>
        </div>
        
        <div class="mb-3">
            <label for="isbn" class="form-label">ISBN</label>
            <input type="text" class="form-control" id="isbn" name="isbn" value="${book.isbn}" required>
        </div>
        
        <div class="mb-3">
            <label for="description" class="form-label">Description</label>
            <textarea class="form-control" id="description" name="description" rows="4">${book.description}</textarea>
        </div>
        
        <div class="mb-3">
            <label for="price" class="form-label">Price</label>
            <input type="number" step="0.01" class="form-control" id="price" name="price" value="${book.price}" required>
        </div>
        
        <div class="mb-3">
            <label for="publicationDate" class="form-label">Publication Date</label>
            <input type="date" class="form-control" id="publicationDate" name="publicationDate" value="${book.publicationDate}">
        </div>
        
        <div class="mb-3">
            <label for="author" class="form-label">Author</label>
            <select class="form-control" id="author" name="author.id" required>
                <option value="">Select an author</option>
                <c:forEach items="${authors}" var="author">
                    <option value="${author.id}" ${book.author.id == author.id ? 'selected' : ''}>
                        ${author.name}
                    </option>
                </c:forEach>
            </select>
        </div>
        
        <div class="d-flex justify-content-between">
            <a href="/books" class="btn btn-secondary">Cancel</a>
            <button type="submit" class="btn btn-primary">${book.id == null ? 'Create' : 'Update'}</button>
        </div>
    </form>
</div> 