package Atividade01;

public class TestEncontraMenor {
    public static void main(String[] args) {
         AlgoritmoBusca algoritmoBusca = new AlgoritmoBusca();
        Produto[] produtos = {
                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasília", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

        int indiceMenor = algoritmoBusca.encontraMenor(produtos); // resultado =2

        //Resultado = Brasília
        System.out.println("O produto mais barato é: " + produtos[indiceMenor].getNome());

        // 16000
        System.out.println("Preço: R$ " + produtos[indiceMenor].getPreco());
    }
}
