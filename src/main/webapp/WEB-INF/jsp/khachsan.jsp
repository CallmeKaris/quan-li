<%-- 
    Document   : khachsan
    Created on : Aug 29, 2021, 2:11:45 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
 <ul>
   
    <c:forEach var="q" items="${ks}">
     <li>${q.idPhong} - ${q.tenPhong}- ${q.giaPhong}$ - ${q.tinhTrang}</li>
      </c:forEach>
       <c:forEach var="q" items="${ks1}">
     <li>${q.idkhachsan} - ${q.tenKS}- ${q.thanhPho} - ${q.idPhong}</li>
      </c:forEach>
 </ul>
