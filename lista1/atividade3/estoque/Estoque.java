package estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    ArrayList<Item> itens;
    Scanner scanner = new Scanner(System.in);

    Estoque() {
        this.itens = new ArrayList<Item>();
    }

    public void adicionarItem(Item novoItem) {
        this.itens.add(novoItem);
    }

    public String listarItens() {
        String listarItens = "";
        for (Item i : this.itens) {
            listarItens += i.imprimir() + "\n";
        }
        return listarItens;
    }

    public String buscarItemPorId(int id) {
        String ret = "Item não encontrado";
        for (Item i : this.itens) {
            if (i.id == id) {
                ret = i.imprimir();
            }
        }
        return ret;
    }

    public void removerItem(int id) {
        for (Item i : this.itens) {
            if (i.id == id) {
                this.itens.remove(i);
                System.out.printf("O intem id: %d foi removido \n", id);
                break;
            }
        }
    }

    public void atualizarQuantidade(int id, int quantidade) {
        for (Item i : this.itens) {
            if (i.id == id) {
                i.quantidade =quantidade;
                System.out.printf("Quantidade o id:  %d atualizada: \n", id);
                break;
            }
        }
    }
}