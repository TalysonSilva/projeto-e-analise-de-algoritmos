package InsertionSort;

import java.util.Arrays;

public class InsertionSort {


   static void  insertionSort(int lista []){
    
        for (int i = 1; i < lista.length; i++) {

            int chave = lista[i];
            int j = i -1;

            while(j >= 0 && lista[j] > chave) {
                lista[j +1] = lista [j];
                j = j -1;

            }

            lista[j +1] = chave;
        }
    } 

    public static void main(String[] args) {

        int [] lista = {20, 2, 7,1, 5, 10};
        
         System.out.println("Antes: " + Arrays.toString(lista));

         insertionSort(lista);

         System.out.println("Depois: " + Arrays.toString(lista));

    }

    
}
