package com.proyecto.dao;

import java.util.List;
import com.proyecto.modelos.Usuario;

public interface UsuarioDAO {
    public boolean insertar(Usuario usuario);
    public List<Usuario> listar();
}
