package com.proyecto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    // RECUERDA: Cambia "tu_base_de_datos" por el nombre de tu base en XAMPP si es diferente
    private static final String URL = "jdbc:mysql://localhost:3306/RaulGod";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 

    public static Connection conectar() {
        Connection cn = null;
        try {
            Class.forName(DRIVER);
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión exitosa a la base de datos!");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver de MySQL. " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión a la BDD: " + e.getMessage());
        }
        return cn;
    }

    // Método de prueba rápida para ejecutar en consola
    public static void main(String[] args) {
        conectar();
    }
}
