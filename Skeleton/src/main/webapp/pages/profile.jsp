<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<c:import url="template/header.jsp" />


<h1> Profile view </h1>

<label> Id: <c:out value="${user.id}"  /></label>

<label> First/Last Name: <c:out value="${user.firstName} ${user.lastName}"  /></label> 

<label> Email: <c:out value="${user.email}" /> </label>

<label> Team: <c:out value="${user.teamName}" /> </label>


<c:import url="template/footer.jsp" />
