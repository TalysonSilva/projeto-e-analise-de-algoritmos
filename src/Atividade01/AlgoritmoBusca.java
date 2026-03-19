package Atividade01;

public class AlgoritmoBusca {

    public int encontraMenor(Produto[] produtos) {
        int posMaisBarato = 0;

        for (int atual = 0; atual < produtos.length; atual++) {
            if (produtos[atual].getPreco() < produtos[posMaisBarato].getPreco()) {

                posMaisBarato = atual;
            }
        }

        return posMaisBarato;
    }

}
