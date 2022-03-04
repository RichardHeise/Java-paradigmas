public class Pessoa {

    private String nome;
    private String email;

    public Pessoa() {
        this.nome = null;
        this.email = null;
    }

    // ---------------- Funcoes referente a nome ------------ //
    public String getNome() throws Exception {
        return this.nome;
    }

    public void setNome(String nome) throws Exception {
        this.nome = nome;
    }
    // --------------- Funcoes referente a email ------------ //
    public String getEmail() throws Exception {
        return this.email;
    }

    public void setEmail(String email) throws Exception {
        this.email = email;
    }

}