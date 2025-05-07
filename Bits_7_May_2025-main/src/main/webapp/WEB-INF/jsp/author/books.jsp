<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="d-flex justify-content-between align-items-center">
    <h2>Books by ${author.name}</h2>
    <a href="/authors" class="btn btn-secondary">Back to Authors</a>
</div>

<div class="card mb-4">
    <div class="card-body">
        <h5 class="card-title">Author Information</h5>
        <p class="card-text"><strong>Email:</strong> ${author.email}</p>
        <p class="card-text"><strong>Biography:</strong> ${author.biography}</p>
    </div>
</div>

<h3>Books</h3>
<c:choose>
    <c:when test="${empty author.books}">
        <div class="alert alert-info">No books found for this author.</div>
    </c:when>
    <c:otherwise>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Title</th>
                    <th>ISBN</th>
                    <th>Price</th>
                    <th>Publication Date</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${author.books}" var="book">
                    <tr>
                        <td>${book.title}</td>
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
    </c:otherwise>
</c:choose> 