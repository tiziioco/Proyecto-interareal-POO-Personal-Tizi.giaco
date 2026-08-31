package com.proyecto.dao;

public class TestPais {
    public static void main(String[] args) {
        // Instanciamos la implementación de nuestro DAO
        PaisDAO paisDAO = new PaisDAOImpl();
        
        System.out.println("Enviando país al Stored Procedure...");
        
        // Ejecutamos el método pasándole el nombre de un país de prueba
        boolean exito = paisDAO.registrarPaisSP("Argentina");
        
        if (exito) {
            System.out.println("¡TEST EXITOSO! Revisá tu tabla en phpMyAdmin.");
        } else {
            System.out.println("Hubo un problema al ejecutar el Stored Procedure.");
        }
    }
}
