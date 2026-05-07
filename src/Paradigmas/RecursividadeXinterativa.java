package Paradigmas;

public class RecursividadeXinterativa {

    public static void main(String[] args) {
        

        System.out.println("Interativa: " + fatorial(4));

        System.out.println("Recursiva: " + fatorial2(4));

    }

    //Interativa
    static long fatorial(long n) {
        long result =  1;

        for(long i= n; i >= 1; i--) {

            result *= i;    
        }

        return result;
    }


    //Recursiva
    static long fatorial2(long n){
        //Caso base
        if (n <= 1) {
            return 1;
        }

        //Chamada recursiva
        return (n * fatorial2(n-1));
    }
}
