<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="form-container">
    <h2>${author.id == null ? 'Add New Author' : 'Edit Author'}</h2>
    
    <form action="${author.id == null ? '/authors' : '/authors/' + author.id}" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" value="${author.name}" required>
        </div>
        
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" class="form-control" id="email" name="email" value="${author.email}" required>
        </div>
        
        <div class="mb-3">
            <label for="biography" class="form-label">Biography</label>
            <textarea class="form-control" id="biography" name="biography" rows="4">${author.biography}</textarea>
        </div>
        
        <div class="d-flex justify-content-between">
            <a href="/authors" class="btn btn-secondary">Cancel</a>
            <button type="submit" class="btn btn-primary">${author.id == null ? 'Create' : 'Update'}</button>
        </div>
    </form>
</div> 