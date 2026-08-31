package com.proyecto.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class PaisDAOImpl implements PaisDAO {

    @Override
    public boolean registrarPaisSP(String nombrePais) {
        Connection cn = null;
        CallableStatement cs = null;
        boolean registroExitoso = false;
        
        // Llamada al Stored Procedure de la Base de Datos
        String sql = "{call sp_registrar_pais(?)}";
        
        try {
            cn = Conexion.conectar();
            cs = cn.prepareCall(sql);
            
            // Pasamos el parámetro al procedimiento
            cs.setString(1, nombrePais);
            
            int filasAfectadas = cs.executeUpdate();
            if (filasAfectadas > 0) {
                registroExitoso = true;
                System.out.println("¡País registrado con Stored Procedure con éxito!");
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar el SP: " + e.getMessage());
        } finally {
            try {
                if (cs != null) cs.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registroExitoso;
    }
}
