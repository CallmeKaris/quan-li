<%-- 
    Document   : register
    Created on : Aug 25, 2021, 8:40:07 PM
    Author     : AD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="container" style="height:860px;">
     <h1>Đăng Ký</h1>
 
    <c:url value="/register" var="action" />
    <form action="${action}" method="post">
        <div class="form-group">
            <label for="username">username</label>
            <input type="text" id="username" name="username"/>
        </div>
        <div class="form-group">
            <label for="password">password</label>
            <input type="password" id="password" name="password"/>
        </div>
        <div class="form-group">

            <input type="submit" value="Đăng Nhập"/>
        </div>
    </form>
</div>
