<%@ page import="br.edu.ifpr.modelos.Usuario"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/app/assets/css/dashboard.css" rel="stylesheet">


</head>
<body>

	<header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
		<a class="navbar-brand col-md-3 col-lg-2 me-0 px-3" href="#">IFPR TechStore</a>
		
		<button class="navbar-toggler position-absolute d-md-none collapsed"
			type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu"
			aria-controls="sidebarMenu" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		
		<input class="form-control form-control-dark w-100" type="text" placeholder="buscar produto" aria-label="Search">
		
		<ul class="navbar-nav px-3">
			<li class="nav-item text-nowrap"><a class="nav-link" href="/applab/login?action=logout">sair</a></li>
		</ul>
	
	</header>

	<div class="container">


		<div class="row">
			
			
			<nav class="col-md-3 col-lg-2 d-md-block sidebar collapse">
				<div class="position-sticky pt-3">
				
					<% //((Usuario) session.getAttribute("usuario")).getNome() %>
	
					<c:choose>
					
						<c:when test="${usuario != null}">
							<p class="px-3">Olá ${usuario.nome}, você está logado no sistema!</p>
						</c:when>
					
						<c:otherwise>
							<p>Você não poderia estar aqui</p>
						</c:otherwise>
					
					</c:choose>
				
					<hr />	
				
					<ul class="nav flex-column">
						<li class="nav-item">
							<a class="nav-link active" href="/applab/admin/produtos?action=listar">listar produtos</a>
						</li>
						
						<li class="nav-item">
							<a class="nav-link active" href="/applab/admin/produtos?action=cadastro">cadastrar produtos</a>
						</li>
					</ul>
				</div>
			</nav>
			
			
			<main class="col-md-9 ms-sm-auto col-lg-10">