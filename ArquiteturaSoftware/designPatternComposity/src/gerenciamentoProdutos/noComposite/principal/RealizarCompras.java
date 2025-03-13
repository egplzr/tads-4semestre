package gerenciamentoProdutos.noComposite.principal;

import gerenciamentoProdutos.noComposite.modelo.Item;
import gerenciamentoProdutos.noComposite.modelo.Kit;

public class RealizarCompras {
    public static void main(String[] args) {
        //realizando uma compra
        Item item1 = new Item("Caneta 1", 3);
        Item item2 = new Item("Caneta 2", 3);
        Item item3 = new Item("Caneta 3", 3);

        Kit kit1 = new Kit("Kit Canetas");
        kit1.adicionarItem(item1);
        kit1.adicionarItem(item2);
        kit1.adicionarItem(item3);

        Kit kit2 = new Kit("Escritório");
        kit2.adicionarItem(new Item("Bolacha", 6));
        kit2.adicionarItem(new Item("Corretivo", 10));
        kit2.adicionarItem(kit1);

        System.out.printf("Valor total: "+kit2.precoTotal());
    }
}
