package lista1.atividade1;

/**
 * verificaNumeroPrimo
 */
public class verificaNumeroPrimo {

    public static void main(String args[]) {
        System.out.println("Ola, mundo!");
        verificarNumeroPrimo(1232132131);
    }

    /// Função utilizada para verificar apenas se número é primo ou não(Return 1 é primo, Return 0 não é primo )
    public static int verificarNumeroPrimo(int n) {
        //Se n tiver valor 1 ou 0, não será 
        if (n == 0 || n == 1) {
            return 0;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return 0;
                }
            }
            return 1; // The number is prime
        }
    }
}