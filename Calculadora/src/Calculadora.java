public class Calculadora {
    double num1;
    double num2;
    double resultado;

    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double calcularSuma(){
        resultado = num1 + num2;
        return resultado;
    }

    public double calcularResta(){
        resultado = num1 - num2;
        return resultado;
    }

    public double calcularMultiplicacion(){
        resultado = num1 * num2;
        return resultado;
    }

    public double calcularDivision(){
        resultado = num1 / num2;
        return resultado;
    }

    public double calcularRaiz(){
        resultado = Math.sqrt(num1);
        return resultado;
    }

    public double calcularPotencia(){
        resultado = Math.pow(num1, num2);
        return resultado;
    }
}