package gerenciamentoProdutos.noComposite.modelo;

import java.util.ArrayList;
import java.util.List;

public class Kit {
    private String nome;
    private List<Object> lista;

    public Kit(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    public void adicionarItem(Object item) {
        lista.add(item);
    }

    public double precoTotal() {
        double valor = 0;
        for(Object obj:lista){
            if(obj instanceof Item item){
                valor += item.getPreco();
            } else if (obj instanceof Kit kit) {
                valor += kit.precoTotal();
            }
        }
        return valor;
    }
}
