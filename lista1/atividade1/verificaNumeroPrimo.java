package lista1.atividade1;
public class verificaNumeroPrimo {

    public static void main(String args[]) {
        System.out.println( verificarNumeroPrimo(1));
        System.out.println( verificarNumeroPrimo(4));
        System.out.println( verificarNumeroPrimo(10));
    }

    /**
     * Função utilizada para verificar apenas se número é primo ou não(Return 1 é primo, Return 0 não é primo )
     * @param n recebe o valor que deseja testar como primo
     * @return 1 retornará valor 0 se for primo, 0 retornará valor 1 se não for primo
     */

    public static int verificarNumeroPrimo(int n) {
        //Se n tiver valor 1 ou 0, não será primo
        if (n <= 1 ) {
            return 0;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return 1;
                }
            }
            return 0; // o número é primo
        }
    }
}