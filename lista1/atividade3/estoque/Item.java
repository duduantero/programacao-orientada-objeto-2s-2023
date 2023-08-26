package estoque;

public class Item {
    int id;
    String nome;
    int quantidade;

    Item(int id, String nome, int quantidade){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    String imprimir(){
        String retorno;
        retorno = this.id + "-" + this.nome + "-" + this.quantidade;
        return  retorno;
    }
}
