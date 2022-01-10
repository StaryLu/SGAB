package sgab.model.dto;

public class Pessoa {
    
    private Long id;
    private final String Login;
    private Long cpf;
    private String nome;
    private String email;
    private String senha;
    private boolean habilitado;

    public Pessoa(String login){
        this.Login = login;
        this.habilitado = true;
    }

    public Pessoa(Long cpf, String login, String nome, String email, String senha){
        this.cpf = cpf;
        this.Login = login;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.habilitado = true;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return Login;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }    

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    public boolean getHabilitado() {
        return habilitado;
    }

}
