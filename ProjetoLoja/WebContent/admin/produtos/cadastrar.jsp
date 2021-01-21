<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="/app/admin/produtos?acao=cadastrar">

		<div class="mb-3">
			<label for="inputNome" class="form-label">Nome</label> 
			<input class="form-control" type="text" id="inputNome" name="inputNome">
		</div>

		<div class="mb-3">
			<label for="inputPrice" class="form-label">Preço</label> 
			<input type="number" class="form-control" id="inputPreco" min="0" value="0" step="0.01" name="inputPreco">
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>


</body>
</html>