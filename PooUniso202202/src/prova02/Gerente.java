package prova02;

public class Gerente extends Funcionario{
    private String senha;
    
    public String cadastrarSenha(String senha)
    {
        String validacao;
        if(senha.length() < 5 )
            return "Senha deve conter no mínimo 5 caracteres";
        
        this.senha = senha;
        return "Senha cadastrada com sucesso";
    }
    public boolean autentica(String senha){
        if (this.senha.equals(senha)) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void setBonificacao() {
        super.setBonificacao(); 
        super.setBonificacao();
    }
    
}
