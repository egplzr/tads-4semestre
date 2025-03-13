package gerenciamentoProdutos.composite.padrao;

import java.util.ArrayList;
import java.util.List;

public class Kit implements Produto{

    private String nome;
    private List<Produto> lista;

    public Kit(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    @Override
    public double getPreco() {
        double valor =0;
        for(Produto produto:lista) {
            valor += produto.getPreco();
        }

        return valor;
    }

    public void adicionarItem(Produto produto){
        lista.add(produto);
    }

    public void removerItem(Produto produto){
        lista.remove(produto);
    }

}
