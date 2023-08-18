package teste;

import revisao.Calculadora;

public class Teste {

    public static void main (String[] args){

        Calculadora calc = new Calculadora();//
        Calculadora calc2 = new Calculadora();//
        calc.setA(1);
        calc.setB(2);
        calc2.setA(5);
        calc2.setB(5);

        calc.somar();
        calc2.somar();

        calc.setOperador("-");


        System.out.println(calc.somar());
        System.out.println(calc2.somar());

    }
}
