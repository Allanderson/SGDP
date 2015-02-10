/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pojo.Usuario;
import DAO.UsuarioDAO;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Allanderson Nunes
 */
@ManagedBean(name = "usuario")
@SessionScoped
public class UsuarioBean {

    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    List<Usuario> listarUsuarios = new ArrayList<Usuario>();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public List<Usuario> getListarUsuarios() {
        return listarUsuarios;
    }

    public void setListarUsuarios(List<Usuario> listarUsuarios) {
        this.listarUsuarios = listarUsuarios;
    }

}
