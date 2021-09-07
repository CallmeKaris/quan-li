<%-- 
    Document   : index
    Created on : Aug 25, 2021, 12:30:23 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
 <ul>
   
    <c:forEach var="q" items="${mess}">
    <spring:url value="admin/users/delete/${q.id}" var="delete"/>
    <spring:url value="admin/users/edit/${q.id}" var="edit"/>
     <li>${q.id} - ${q.username} - ${q.password} - <a href="${delete}"  id="${q.id}">xoa</a>-<a href="${edit}" >sua</a> - ${q.userRole}</li>
      </c:forEach>
 </ul>
        

