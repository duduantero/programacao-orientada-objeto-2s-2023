package lista2.atividade6;
public class MedicamentoGenerico extends Medicamento {
    private String principioAtivo;
    private String laboratorio;

    public MedicamentoGenerico(String nome, double precoUnitario, int quantidadeEmEstoque, String principioAtivo, String laboratorio) {
        super(nome, precoUnitario, quantidadeEmEstoque);
        this.principioAtivo = principioAtivo;
        this.laboratorio = laboratorio;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Princípio Ativo: " + principioAtivo + ", Laboratório: " + laboratorio;
    }
}
