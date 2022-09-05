public class Contato {
    private String nome;
    private char sexo;
    private String email;
    private String telefone;

    public Contato(String nome, char sexo,String email, String telefone){

       this.nome=nome;
        this.sexo=sexo;
        this.email=email;
        this.telefone=telefone;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
