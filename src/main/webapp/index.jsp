<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de Usuarios - RAULGOD</title>
</head>
<body>
    <h2>Formulario de Registro (Arquitectura en Capas)</h2>
    <form action="registro" method="POST">
        <label>Nombre:</label><br>
        <input type="text" name="txtNombre" required><br><br>
        
        <label>Email:</label><br>
        <input type="email" name="txtEmail" required><br><br>
        
        <input type="submit" value="Registrar Usuario">
    </form>
</body>
</html>
