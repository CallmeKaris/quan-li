<%-- 
    Document   : login
    Created on : Aug 25, 2021, 2:05:06 PM
    Author     : AD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="container" style="height:860px;">
    <c:if test="${param.error !=null}">
    <div class="alert alert-danger">
        <p>da co loi xay ra</p>
    </div>
    </c:if>
    <c:if test="${param.accessDeined !=null}">
    <div class="alert alert-danger">
        <p>Ban khong du quyen truy cap</p>
    </div>
    </c:if>
    <h1>Đăng Nhập</h1>
    <c:if test="${param.error!=null}">
        <div class="alert alert-danger">da co loi xay ra</div>
    </c:if>
    <c:url value="/login" var="action" />
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