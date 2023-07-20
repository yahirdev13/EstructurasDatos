
public class Esfera {

    private double radio;

    public Esfera(double r){
        radio = r;
    }

    public void setRadio(double r){
        radio = r;
    }

    public double getRadio(){
        return radio;
    }

    public double calcularArea(){
        return 4 * 3.1416 * (radio * radio);
    }

    public double calcularVolumen(){
        return 4/3 * 3.1416 * (radio * radio * radio);
    }

    public double calcularDiametro(){
        return (2 * radio);
    }

    public double calcularCircunferencia(){
        return 3.1416 * (radio * 2);
    }

}

