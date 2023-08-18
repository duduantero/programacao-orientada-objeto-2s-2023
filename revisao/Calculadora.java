package revisao;

/**
 * Calculadora
 */
public class Calculadora {
private Integer a,b;
private String operador;


    public Integer getA(){
        return this.a;
    }
    public void setA(Integer a){
        this.a =a;
    }

    public Integer getB(){
        return this.b;
    }
    public void setB(Integer b){
        this.b =b;
    }

    public String getOperador(){
        return this.operador;
    }
    public void setOperador(String operador) throws Exception{
        boolean error = true;
        switch (operador){
            case "+":
                error = false;
                break;
            case "-":
                error = false;
                break;
            case "/":
                error = false;
                break;
            case "*":
                error = false;
                break;
        }
        if(error){
            throw new Exception("Operador inválido");
        }
    }


    public int somar(){
        return  this.a + this.b;
    }

    public Integer operar() {
        Integer ret = 0;
        switch (this.operador) {

            case "-":
                ret = this.a - this.b;
                break;

        case "+":
            ret = this.a + this.b;
            break;

        case "*":
            ret =  this.a * this.b;
            break;

        default:
            return 0;
    }
        return  ret;}
}
