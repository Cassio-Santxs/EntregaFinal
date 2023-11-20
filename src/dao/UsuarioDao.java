/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Models.UsuarioModel;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Aluno 63
 */
public class UsuarioDao {
    private ConexaoBanco conexao;
    
    public UsuarioDao() {
        this.conexao = new ConexaoBanco();
    }
    
    public UsuarioModel getUsuarioById(int idUsuario) {
        String sql = "SELECT * FROM tbUsuarios WHERE idUsuario = ?";

        try {
            if (conexao.conectar()) {
                PreparedStatement sentenca = conexao.getConnection().prepareStatement(sql);
                sentenca.setInt(1, idUsuario); 

                ResultSet rs = sentenca.executeQuery();

                if (rs.next()) {
                    UsuarioModel usuario = new UsuarioModel();
                    usuario.setIdUsuario(rs.getInt("idUsuario"));
                    usuario.setNmUsuario(rs.getString("nmUsuario"));
                    usuario.setDsCEP(rs.getString("dsCEP"));
                    usuario.setDsBairro(rs.getString("dsBairro"));
                    usuario.setDsCidade(rs.getString("dsCidade"));
                    usuario.setDsRua(rs.getString("dsRua"));
                    usuario.setNrDoc(rs.getString("nrDoc"));
                    usuario.setNrTelefone(rs.getString("nrTelefone"));
                    usuario.setDsEmail(rs.getString("dsEmail"));
                    usuario.setDsSenha(rs.getString("dsSenha"));
                    usuario.setIdSexualidade(rs.getInt("idSexualidade"));
                    usuario.setFlAdmin(rs.getBoolean("flAdmin"));


                    sentenca.close();
                    this.conexao.getConnection().close();

                    return usuario;
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }

            return null; 
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
