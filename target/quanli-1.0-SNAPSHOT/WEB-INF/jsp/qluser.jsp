<%-- 
    Document   : qluser
    Created on : Aug 27, 2021, 2:19:41 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<div class="contentright">
    
    <h1>Quản lí người dùng</h1>
    <table class="table table-bordered" >
        <thead>
          <tr>
            <th>id</th>
            <th>Username</th>
            <th>Password</th>
            <th>Hành Động</th>
          </tr>
        </thead>
    <tbody>
       <c:forEach var="q" items="${mess}">   
            <tr>
                  <td>${q.id}</td>
                  <td>${q.username}</td>
                  <td>${q.password}</td>
                  <td> 
                      <spring:url value="users/profile/${q.id}" var="profile"/>
                       <spring:url value="users/delete/${q.id}" var="delete"/>
                       <spring:url value="users/edit/${q.id}" var="edit"/>
                      <button type="button" class="btn btn-info"><a href="${profile}">Thông tin</a></button>
                      <button type="button" class="btn btn-primary"><a href="${edit}">Chỉnh sửa</a></button>
                      <button type="button" class="btn btn-danger"><a href="${delete}">Xóa</a></button>
                  </td>
            </tr>
        </c:forEach>
    </tbody>
  </table>        
</div>
