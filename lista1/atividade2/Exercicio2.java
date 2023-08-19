package lista1.atividade2;



//Conversor de Temperatura Crie um conversor de temperatura que permita ao usuário converter entre Celsius e Fahrenheit.
// Peça ao usuário para escolher a direção da conversão e, em seguida, faça a conversão e exiba o resultado.
//°F = (°C x 1,8) + 32
public class Exercicio2 {

    private double celsius, fahrenheit;


    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return this.celsius;
    }

    public double celciusToFahrenheit() {
        this.fahrenheit = (getCelsius()*1.8)+32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Exercicio2 conversao = new Exercicio2();
        conversao.setCelsius(25);
        System.out.println(conversao.celciusToFahrenheit());
        conversao.setCelsius(-10);
        System.out.println(conversao.celciusToFahrenheit());

    }
}









