package exemplo.com;

public abstract class Item {
    protected int id;
    protected String titulo;

    public abstract void cadastrar();

    public abstract void consultar();

    public abstract void atualizar();   

    public abstract void excluir();
}
