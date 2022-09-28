package poo.lista06;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos = 
            new ArrayList<>();

    public Curso() {
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAluno(int index){
        alunos.remove(index);
    }
    public String imprimir(){
        return "Código: "+ codigo + "\n" +
               "Nome: " + nome + "\n" +
                "Carga horária: " + cargaHoraria; 
    }
    public String imprimirCompleto(){
        String retorno = imprimir();
        retorno += "\n";
        for (Aluno aluno : alunos) {
            retorno += aluno.imprimir();
        }
        return retorno;
    }
}
