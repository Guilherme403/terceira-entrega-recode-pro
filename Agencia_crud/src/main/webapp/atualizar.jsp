<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./CSS/style.css">
<link rel="icon" type="image/x-icon" href="./icon/favicon.ico">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Update</title>
</head>
<body>
	<!-- Cabeçalho -->
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark text-light"
			style="background-color: #0098b3">
			<div class="container">
				<a class="navbar-brand" href="#"><img src="./icon/"
					height="48px"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarNav" aria-controls="navbarNav"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>
						<li class="nav-item"><a class="nav-link"
							href="ReadController">Cadastros</a></li>
						<li class="nav-item"><a class="nav-link" href="">Ofertas</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="">Destinos</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="">Contato</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	
<body>
	<main>
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6">
					<h1 class="mt-5">Atualizar Cliente</h1>
					<form class="mt-5" action="UpdateController" method="post">
						<div class="form-group">
							<label for="nome">ID:</label> <input type="text"
								class="form-control" id="id" name="id" value="${client.id}"
								readonly>
						</div>
						<div class="form-group">
							<label for="nome">Nome:</label> <input type="text"
								class="form-control" id="nome" name="nome"
								value="${client.nome}" required>
						</div>
						<div class="form-group">
							<label for="contato">Contato:</label> <input type="text"
								class="form-control" id="contato" name="contato"
								value="${client.contato}" required>
						</div>
						<div class="form-group">
							<label for="email">E-mail:</label> <input type="text"
								class="form-control" id="email" name="email"
								value="${client.email}" required>
						</div>
						<div class="form-group">
							<label for="senha">Senha:</label> <input type="password"
								class="form-control" id="senha" name="senha"
								value="${client.senha}" required>
						</div>
						<div class="form-group">
							<label for="Nascimento">Nascimento:</label> <input type="date"
								value="${client.dataNasc}" class="form-control" id="dataNasc"
								name="dataNasc" required>
						</div>
						<button type="submit" class="btn btn-primary">Atualizar</button>
					</form>
				</div>
			</div>
		</div>
	</main>
</body>

<!-- Rodapé -->
<footer class=" text-light text-center py-3 fixed-bottom"
	style="background-color: #0098b3"> &copy; 2023 Decolar Full.
	Todos os direitos reservados. </footer>

<!-- Inclua os scripts do Bootstrap via CDN -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>