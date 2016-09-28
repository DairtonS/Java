<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="StyleSheet" type="text/css" href="src/bootstrap.css" media="screen" >
<style type="text/css"> <%@ include  file="src/bootstrap.css"%> </style>

<!-- <link rel="StyleSheet" type="text/css" href="src/main.css" media="screen" > -->
<%-- <style type="text/css"> <%@ include  file="src/main.css"%> </style> --%>


<title>Home Page </title>
</head>
<body>

<h2>Forumlário de Inclusão de acesso</h2>



<form action="add" method="get">

<label> Nome </label>
<input type="text" id="nome" name="nome"> <br>

<label> Codigo do Agente </label>
<input type="text" id="nome" name="codagente"> <br>

<label> Sisdia</label>
<input type="text" id="login" name="login"> <br>

<label> Senha Sisdia </label>
<input type="text" id="senha" name="senha"> <br>

<label> Email </label>
<input type="text" id="email" name="email"> <br>

<label> Cargo</label>
<input type="text" id="cargo" name="cargo"> <br>

<label> MMCB </label>
<input type="text" id="mmcb" name="mmcb"> <br>

<label> VIP1</label>
<input type="text" id="vip1" name="vip1"> <br>

<label> Senha VIP1</label>
<input type="text" id="senhavip1" name="senhavip1"> <br>

<label> Obs</label>
<input type="text" id="obs" name="obs"> <br>

<input type="submit" value="Adicionar"> 
<!-- <a href="add">Enviar</a> -->
<button type="submit" formmethod="post" formaction="ok">Alterar</button>
<input type="reset" value="Limpar"/>
</form>

</body>
</html>