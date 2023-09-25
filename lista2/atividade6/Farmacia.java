package lista2.atividade6;
import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private String nome;
    private String endereco;
    private List<Medicamento> estoque;

    public Farmacia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.estoque = new ArrayList<>();
    }

    public void adicionarMedicamento(Medicamento medicamento) {
        estoque.add(medicamento);
    }

    public boolean venderMedicamento(String nome, int quantidade) {
        for (Medicamento medicamento : estoque) {
            if (medicamento.getNome().equalsIgnoreCase(nome)) {
                if (medicamento.getQuantidadeEmEstoque() >= quantidade) {
                    medicamento.setQuantidadeEmEstoque(medicamento.getQuantidadeEmEstoque() - quantidade);
                    return true;
                }
            }
        }
        return false;
    }

    public String verificarVenda(String nome, int quantidade) {
        for (Medicamento medicamento : estoque) {
            if (medicamento.getNome().equalsIgnoreCase(nome)) {
                if (medicamento.getQuantidadeEmEstoque() >= quantidade) {
                    medicamento.setQuantidadeEmEstoque(medicamento.getQuantidadeEmEstoque() - quantidade);
                    return "Venda concluída.";
                }
            }
        }
        return "Venda não concluída. Estoque insuficiente.";
    }


    public void exibirEstoque() {
        System.out.println("Estoque da Farmácia " + nome + ":");
        for (Medicamento medicamento : estoque) {
            System.out.println(medicamento);
        }
    }
}
