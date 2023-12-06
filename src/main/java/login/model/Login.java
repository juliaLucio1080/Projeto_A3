package login.model;


public class Login {
    private String  email, senha, nome, d_nascimento;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
   public void Cadastrar (String nome, String email, String senha, String d_nascimento) {
       this.nome = nome;
       this.email = email;
       this.senha = senha;
       this.d_nascimento =d_nascimento;
   }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return d_nascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.d_nascimento = dataDeNascimento;
    }
   
   

}

               

       
  
       
   
