/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Adm
 */
public class CategoriaUsuarioModel {
    private int idCategoriaUsuario;
    private String nmCategoriaUsuario;
    
    public CategoriaUsuarioModel(int idCategoriaUsuario, String nmCategoriaUsuario) {
        this.idCategoriaUsuario = idCategoriaUsuario;
        this.nmCategoriaUsuario = nmCategoriaUsuario;
    }
    
    public int getIdCategoriaUsuario() {
        return this.idCategoriaUsuario;
    }
    
    public void setIdCategoriaUsuario(int idCategoriaUsuario) {
        this.idCategoriaUsuario = idCategoriaUsuario;
    }
    
    public String getNmCategoriaUsuario() {
        return this.nmCategoriaUsuario;
    }
    
    public void setCategoriaUsuario(String nmCategoriaUsuario) {
        this.nmCategoriaUsuario = nmCategoriaUsuario;
    }
}
