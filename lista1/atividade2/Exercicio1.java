package lista1.atividade2;

public class Exercicio1 {

    private Integer a;
    private Integer b;
    private String operador;

    public Integer getA(){
        return this.a;
    }

    public void setA(Integer a){
        this.a = a;
    }

    public Integer getB(){
        return this.b;
    }

    public void setB(Integer b){
        this.b = b;
    }

    public String getOperador(){
        return this.operador;
    }

    public void setOperador(String op) throws Exception {
        Boolean err = true;
        switch (op) {
            case "+":
                err = false;
                break;
            case "-":
                err = false;
                break;
            case "*":
                err = false;
                break;
            case "/":
                err = false;
                break;
        }

        if(err){
            throw new Exception("Operador inválido");
        }

        this.operador = op;
    }

    public Integer operar(){
        Integer ret = switch (this.operador) {
            case "+" -> this.a + this.b;
            case "-" -> this.a - this.b;
            case "*" -> this.a * this.b;
            case "/" -> this.a / this.b;
            default -> 0;
        };
        return ret;
    }

    public static void main(String[] args) {

        Exercicio1 calc = new Exercicio1();

        calc.setA(3);
        calc.setB(5);
        try {
            calc.setOperador("+");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(calc.operar());

    }
}

