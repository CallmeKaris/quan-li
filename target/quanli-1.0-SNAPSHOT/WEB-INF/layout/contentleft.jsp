<%-- 
    Document   : contentright
    Created on : Aug 27, 2021, 2:23:18 PM
    Author     : AD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="contentleft" style="width: 20%;height:860px; float: left;">
   <div class="card" style="width:100%;">
        <img class="card-img-top" src="https://huyhoanhotel.com/wp-content/uploads/2016/05/765-default-avatar.png" alt="Card image">
        <div class="card-body">
        
          <h4 class="card-title">${pageContext.request.userPrincipal.name}</h4>
        </div>
   </div>
  <ul class="list-group">
    
        <li class="list-group-item active"> Các Chức Năng</li> 
   <sec:authorize access="hasRole('ROLE_ADMIN')">  
        <li class="list-group-item"><a href="<c:url value="/admin/user"/>">Quản lí người dùng</a></li>
        <li class="list-group-item"><a href>Quản lí khách sạn</a></li>
        <li class="list-group-item"><a href>Quản lí tour</a></li>
    </sec:authorize>
  </ul>
</div>
