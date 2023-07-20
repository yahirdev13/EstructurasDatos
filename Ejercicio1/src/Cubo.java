public class Cubo {
    private double lado;

    public Cubo(double l) {
        lado = l;
    }

    public void setLado(double l) {
        lado = l;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return (lado * lado) * 6;
    }

    public double calcularvolumen() {
        return lado * lado * lado;
    }
}
