/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Adm
 */
public class UsuarioModel {
    private int idUsuario;
    private String nmUsuario;
    private String dsCEP;
    private String dsBairro;
    private String dsCidade;
    private String dsRua;
    private int idCategoriaUsuario;
    private int idSexualidade;

    // Construtor
    public UsuarioModel(int idUsuario, String nmUsuario, String dsCEP, String dsBairro, String dsCidade, String dsRua, int idCategoriaUsuario, int idSexualidade) {
        this.idUsuario = idUsuario;
        this.nmUsuario = nmUsuario;
        this.dsCEP = dsCEP;
        this.dsBairro = dsBairro;
        this.dsCidade = dsCidade;
        this.dsRua = dsRua;
        this.idCategoriaUsuario = idCategoriaUsuario;
        this.idSexualidade = idSexualidade;
    }

    // Métodos getters e setters (ou apenas getters se não for necessário alterar os valores diretamente)
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public String getDsCEP() {
        return dsCEP;
    }

    public String getDsBairro() {
        return dsBairro;
    }

    public String getDsCidade() {
        return dsCidade;
    }

    public String getDsRua() {
        return dsRua;
    }

    public int getIdCategoriaUsuario() {
        return idCategoriaUsuario;
    }

    public int getIdSexualidade() {
        return idSexualidade;
    }
}

