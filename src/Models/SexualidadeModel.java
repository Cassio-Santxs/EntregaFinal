/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Adm
 */
public class SexualidadeModel {
    private int idSexualidade;
    private String nmSexualidade;
    
    public SexualidadeModel(int idSexualidade, String nmSexualidade) {
        this.idSexualidade = idSexualidade;
        this.nmSexualidade = nmSexualidade;
    }
    
    public int getIdSexualidade() {
        return this.idSexualidade;
    }
    
    public void setIdSexualidade(int idSexualidade) {
        this.idSexualidade = idSexualidade;
    }
    
    public String getNmSexualidade() {
        return this.nmSexualidade;
    }
    
    public void setNmSexualidade(String nmSexualidade) {
        this.nmSexualidade = nmSexualidade;
    }
}
