package Atividade03;

public class Aluno {

    String nome ;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota=" + nota + "]";
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    
    
}
