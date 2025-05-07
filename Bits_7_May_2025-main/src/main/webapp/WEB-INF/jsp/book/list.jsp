<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="d-flex justify-content-between align-items-center">
    <h2>Books</h2>
    <a href="/books/new" class="btn btn-primary">Add New Book</a>
</div>

<table class="table table-striped">
    <thead>
        <tr>
            <th>Title</th>
            <th>Author</th>
            <th>ISBN</th>
            <th>Price</th>
            <th>Publication Date</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.title}</td>
                <td>${book.author.name}</td>
                <td>${book.isbn}</td>
                <td>${book.price}</td>
                <td>${book.publicationDate}</td>
                <td>
                    <a href="/books/${book.id}/edit" class="btn btn-sm btn-warning">Edit</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table> 