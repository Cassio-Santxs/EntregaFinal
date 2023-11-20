package Models;

public class UsuarioModel {

    private int idUsuario;
    private String nmUsuario;
    private String dsCEP;
    private String dsBairro;
    private String dsCidade;
    private String dsRua;
    private String nrDoc;
    private String nrTelefone;
    private String dsEmail;
    private String dsSenha;
    private int idSexualidade;
    private boolean flAdmin;

    // Construtor vazio
    public UsuarioModel() {
        // Pode ser usado para criar uma instância sem fornecer valores iniciais.
    }

    // Métodos getters

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

    public String getNrDoc() {
        return nrDoc;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public String getDsSenha() {
        return dsSenha;
    }

    public int getIdSexualidade() {
        return idSexualidade;
    }

    public boolean isFlAdmin() {
        return flAdmin;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public void setDsCEP(String dsCEP) {
        this.dsCEP = dsCEP;
    }

    public void setDsBairro(String dsBairro) {
        this.dsBairro = dsBairro;
    }

    public void setDsCidade(String dsCidade) {
        this.dsCidade = dsCidade;
    }

    public void setDsRua(String dsRua) {
        this.dsRua = dsRua;
    }

    public void setNrDoc(String nrDoc) {
        this.nrDoc = nrDoc;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public void setDsSenha(String dsSenha) {
        this.dsSenha = dsSenha;
    }

    public void setIdSexualidade(int idSexualidade) {
        this.idSexualidade = idSexualidade;
    }

    public void setFlAdmin(boolean flAdmin) {
        this.flAdmin = flAdmin;
    }
}

