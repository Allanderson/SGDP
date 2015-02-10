/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import conexaoBanco.ConnectionFactory;
import pojo.Usuario;

/**
 *
 * @author Allanderson Nunes
 */
public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    public UsuarioDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public boolean setUsuario(Usuario usuario) {
        return false;
    }

    public Usuario getUsuario(String login, String senha) {
        return null;
    }

    public boolean atualizarDadosUsuario() {
        return false;
    }
}
