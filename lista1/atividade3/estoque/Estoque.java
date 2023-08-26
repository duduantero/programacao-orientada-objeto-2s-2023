package estoque;

import java.util.ArrayList;

public class Estoque {
    ArrayList<Item> itens;

    Estoque(){
        this.itens = new ArrayList<Item>();
    }
    public void  adicionarItem(Item novoItem){
        this.itens.add(novoItem);
    }

    public  String listarItens(){
        String listarItens = "";
        return  listarItens;
    }

    public String buscarItemPorId(int id){
        String ret = "Item não encontrado";
        for (Item i : this.itens) {
            if(i.id == id){
                ret = i.imprimir();
            }
        }
    return ret;
    }
    public void removerItem (){}
    public void atualizarQuantidade(){}
}
