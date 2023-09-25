package lista2.atividade6;

public abstract class Medicamento {
    private String nome;
    private double precoUnitario;
    private int quantidadeEmEstoque;

    public Medicamento(String nome, double precoUnitario, int quantidadeEmEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço Unitário: " + precoUnitario + ", Quantidade em Estoque: " + quantidadeEmEstoque;
    }
}

