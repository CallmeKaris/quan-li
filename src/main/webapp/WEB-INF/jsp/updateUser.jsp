<%-- 
    Document   : updateUser
    Created on : Aug 26, 2021, 9:12:42 PM
    Author     : AD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="container" style="height:860px;">
     <h1>Chỉnh sửa</h1>
 
    <c:url value="/edit" var="action" />
    <form action="${action}" method="post" class="was-validated">
         <div class="form-group">
            <label for="id">id   </label>
            <input type="text" id="id" name="id" readonly="true" value="${user.id}" class="form-control"/>
           
        </div>
        <div class="form-group">
            <label for="username">username</label>
            <input type="text" id="username" name="username"value="${user.username}" class="form-control"/>
             <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="password">password</label>
            <input type="password" id="password" name="password" value="${user.password}" class="form-control"/>
             <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <input type="submit" value="Chỉnh sửa" class="btn btn-primary mb-2"/>
        </div>
        <button type="button" class="btn btn-secondary"><a href="<c:url value="/admin/user" />">Quay lại</a></button>     
    </form>
</div>