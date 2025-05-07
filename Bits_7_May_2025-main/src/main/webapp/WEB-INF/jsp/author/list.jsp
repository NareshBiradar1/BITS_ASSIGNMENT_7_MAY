<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="d-flex justify-content-between align-items-center">
    <h2>Authors</h2>
    <a href="/authors/new" class="btn btn-primary">Add New Author</a>
</div>

<table class="table table-striped">
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${authors}" var="author">
            <tr>
                <td>${author.id}</td>
                <td>${author.name}</td>
                <td>${author.email}</td>
                <td>
                    <a href="/authors/${author.id}/edit" class="btn btn-sm btn-warning">Edit</a>
                    <a href="/authors/${author.id}/books" class="btn btn-sm btn-info">View Books</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table> 