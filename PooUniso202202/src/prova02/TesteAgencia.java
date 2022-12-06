
package prova02;

public class TesteAgencia {
    public static void main(String[] args) {
        //cadastrar Agencia
        Agencia ag = new Agencia();
        
        Funcionario seguranca = new Funcionario();
        seguranca.setNome("João");
        seguranca.setEmail("joao@gmail.com");
        seguranca.setCpf("123");
        
        Gerente ger = new Gerente();
        ger.setNome("Pedro");
        ger.setEmail("pedro@gmail.com");
        ger.setCpf("321");
        ger.cadastrarSenha("12345");
        
        Cliente cli = new Cliente();
        cli.setNome("Edson");
        cli.setEmail("edson.feitosa@gmail.com");
        cli.setTelefone("12345");
        
        Cliente cli2 = new Cliente();
        cli2.setNome("Renata");
        cli2.setEmail("renata@gmail.com");
        
        cli.cadastraConta(100, 0);
        cli2.cadastraConta(500, 10);
        
        ag.cadastrarCliente(cli);
        ag.cadastrarCliente(cli2);
        ag.cadatrarFuncionario(seguranca);
        ag.cadatrarFuncionario(ger);
        System.out.println("total da agência: "+ag.valorTotalAgencia());
                
    }
}
