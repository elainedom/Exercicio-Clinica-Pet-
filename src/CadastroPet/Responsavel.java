package CadastroPet;

public class Responsavel {
    //criar atributos para serem acesado pela classe Pet
    private String nome;
    private String sobrenome;
    private String cep;
    private String numeroResidencial;
    private int idade;
    private String email;
    private String telefone;

    //Solicita a leitura dos atributos
    public String getNome() { //solicita a leitura do nome
        return nome; //retorna para o nome
    }
    //Solicita a mudança dos atributos
    public void setNome(String nome) { //solicita a mudança do nome
        this.nome = nome; //retorna para mudar o nome
    }

    public String getSobrenome() { //solicita a leitura do sobrenome
        return sobrenome; //retorna para o sobrenome
    }

    public void setSobrenome(String sobrenome) { // solicita a mudança do sobrenome
        this.sobrenome = sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroResidencial() {
        return numeroResidencial;
    }

    public void setNumeroResidencial(String numeroResidencial) {
        this.numeroResidencial = numeroResidencial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Responsavel(String nome, String sobrenome, String cep, String numeroResidencial, int idade, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }
    public String retornarTodosDados(){
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public boolean verificarMaioridade(int idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
}

