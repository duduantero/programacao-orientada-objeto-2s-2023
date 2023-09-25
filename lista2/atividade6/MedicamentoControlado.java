package lista2.atividade6;

public class MedicamentoControlado extends Medicamento {
    private String numRegistro;

    public MedicamentoControlado(String nome, double precoUnitario, int quantidadeEmEstoque, String numRegistro) {
        super(nome, precoUnitario, quantidadeEmEstoque);
        this.numRegistro = numRegistro;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Registro: " + numRegistro;
    }
}

