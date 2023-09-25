package lista2.atividade6;

public class Executar {
    public static void main(String[] args) {
        // Criar uma farmácia

        Farmacia farmacia = new Farmacia("Minha Farmácia", "123 Rua Principal");

        // Adicionar medicamentos ao estoque
        MedicamentoGenerico medicamentoGenerico1 = new MedicamentoGenerico("Paracetamol", 5.0, 100, "Paracetamol", "Laboratório A");
        MedicamentoGenerico medicamentoGenerico2 = new MedicamentoGenerico("Ibuprofeno", 7.0, 50, "Ibuprofeno", "Laboratório B");
        MedicamentoControlado medicamentoControlado1 = new MedicamentoControlado("Rivotril", 20.0, 10, "123456");
        MedicamentoControlado medicamentoControlado2 = new MedicamentoControlado("Morfina", 15.0, 5, "789012");

        farmacia.adicionarMedicamento(medicamentoGenerico1);
        farmacia.adicionarMedicamento(medicamentoGenerico2);
        farmacia.adicionarMedicamento(medicamentoControlado1);
        farmacia.adicionarMedicamento(medicamentoControlado2);

        // Exibir o estoque da farmácia
        farmacia.exibirEstoque();

        // Vender medicamentos
        String nomeMedicamento1 = "Paracetamol";
        String nomeMedicamento2 = "Rivotril";

        boolean venda1 = farmacia.venderMedicamento(nomeMedicamento1, 3);
        boolean venda2 = farmacia.venderMedicamento(nomeMedicamento2, 12);

        String mensagemVenda1 = farmacia.verificarVenda(nomeMedicamento1, 3);
        String mensagemVenda2 = farmacia.verificarVenda(nomeMedicamento2, 12);

        System.out.println("Venda de " + nomeMedicamento1 + ": " + mensagemVenda1);
        System.out.println("Venda de " + nomeMedicamento2 + ": " + mensagemVenda2);

        // Exibir o estoque atualizado
        farmacia.exibirEstoque();
    }
}

