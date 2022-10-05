package poo.lista06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    /*
        Comentário do Professor
        O erro do final da aula aconteceu porque 
        não pode fechar o scanner quanto tem um dentro do 
        outro... Só fecha uma vez no final - Próxima aula terminamos o exemplo
        BONS ESTUDOS!!!
    */
    static ArrayList<Curso> cursos = new ArrayList<>();
    public static void main(String[] args) {
        int opcao = 0;
        Scanner tec = new Scanner(System.in);
        while (opcao != 6) {            
            System.out.println("1 – Criar Curso");
            System.out.println("2 – Criar Aluno");
            System.out.println("3 – Remover Aluno");
            System.out.println("4 – Mostrar Todos os Cursos");
            System.out.println("5 – Mostrar alunos do curso");
            System.out.println("6 – Sair");
            opcao = Integer.parseInt(tec.nextLine());
            switch (opcao) {
                case 1:
                    //1 – Criar Curso
                    opcao1();
                    break;
                case 2:
                    //2 – Criar Aluno
                    opcao2();
                    break;
                case 3:
                    //3 – Remover Aluno
                    opcao3();
                    break;
                case 4:
                    //4 – Mostrar Todos os Cursos
                    opcao4();
                    break;
                case 5:
                    //5 – Mostrar alunos do curso
                    opcao5();
                    break;
                case 6:
                    System.out.println("O programa será fechado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        tec.close();
    }
    
    public static void opcao1(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o nome do curso");
        var nomeCurso = tec.nextLine();
        System.out.println("Digite o código do curso");
        var codCurso = Integer.parseInt(tec.nextLine());
        System.out.println("Digite a carga horária do curso");
        var carga = Integer.parseInt(tec.nextLine());
        Curso c = new Curso(codCurso, nomeCurso, carga);
        cursos.add(c);

    }
    public static void opcao2(){
        Scanner tec = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.println("Digite o RA do aluno");
        a.setRa(tec.nextLine());
        System.out.println("Digite o nome do aluno");
        a.setNome(tec.nextLine());
        System.out.println("Escolha o código do curso");
        opcao4();
        int codCurso = Integer.parseInt(tec.nextLine());
        for (Curso curso : cursos) {
            if (curso.getCodigo() == codCurso) {
                curso.inserirAluno(a);
            }
        }

    }
    public static void opcao3(){
        //3 – Remover Aluno
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o código do curso.");
        System.out.println("-------------------------");
        opcao4();
        int codCurso = Integer.parseInt(tec.nextLine());
        Curso cursoEscolhido = new Curso();
        for (Curso curso : cursos) {
            if (curso.getCodigo() == codCurso) {
                cursoEscolhido = curso;
            }
        }
        System.out.println("Digite o RA do aluno a ser removido.");
        var ra = tec.nextLine();
        Aluno alunoEscolhido = new Aluno();
        for (Aluno aluno : cursoEscolhido.getAlunos()) {
            if (aluno.getRa().equals(ra)) {
                alunoEscolhido = aluno;
            }
        }
        cursoEscolhido.removerAluno(
                cursoEscolhido.getAlunos().indexOf(alunoEscolhido));

    }
    public static void opcao4(){
        for (Curso curso : cursos) {
            System.out.println(curso.imprimir());
        }
    }
    public static void opcao5(){
        for (Curso curso : cursos) {
            System.out.println(curso.imprimirCompleto());
            System.out.println("--------------------");
        }
    }
}
