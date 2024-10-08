package br.com.fps.dao;

import java.util.List;

import br.com.fps.entidades.Usuario;
import br.com.fps.entidades.Usuario;

public interface UsuarioDAO {

    Usuario save(Usuario usuario) throws Exception;

    Usuario edit(Usuario usuario) throws Exception;
 
    Usuario findById(Long usuarioId) throws Exception;
 
    void delete(Usuario usuario) throws Exception;
 
    List<Usuario> list() throws Exception;
}
