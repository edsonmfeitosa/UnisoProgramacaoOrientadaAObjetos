package poo;

public class Pessoa {
    private String nome;
    private String telefone;
    public int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    void perguntarONome(Pessoa pes){
        System.out.println("Qual o seu nome?");
        //System.out.println("Meu nome é "+
        //        pes.nome);
        pes.responderONome();
    }
    void responderONome(){
        System.out.println("Meu nome é "+
                nome);
    }
}
