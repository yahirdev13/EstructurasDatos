public class Cliente {
    String nombre;
    String carrito = "sin carrito";

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, String carrito) {
        this.nombre = nombre;
        this.carrito = carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrito() {
        return carrito;
    }

    public void setCarrito(String carrito) {
        this.carrito = carrito;
    }
}
