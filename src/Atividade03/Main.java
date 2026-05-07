package Atividade03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Aluno [] listaAlunos = new Aluno[4];
        listaAlunos[0] = new Aluno("talyson", 9);
        listaAlunos[1] = new Aluno("João", 6.5);
        listaAlunos[2] = new Aluno("Rafael", 8.5);
        listaAlunos[3] = new Aluno("Lucy", 5.5);
       


        System.out.println("Antiga: " + Arrays.toString(listaAlunos));

        selectionSort(listaAlunos);

        System.out.println("Nova: " + Arrays.toString(listaAlunos));
 
    }

    static void selectionSort(Aluno[] lista) {

        for (int i = 1;  i < lista.length; i++) {
            Aluno atual = lista [i];
            double alunoNota = atual.getNota();
            
            int j = i - 1;

            while(j >= 0 && lista[j].getNota() > alunoNota) {
                lista[j +1] = lista [j];
                j = j -1;

            }

            lista[j +1] = atual ;

        }
    }

    static Aluno BuscaAlunoMaiorNota (Aluno[] Lista) {
        
        
        for(int i = )
        return Aluno[]
    }
}
