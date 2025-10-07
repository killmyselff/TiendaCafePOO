package src;

public class Cafe {
    private String nombre;
    private String region;
    private double precioPorKilo;
    private float cantidadEnKilos;

    public Cafe(String nombre, String region, double precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Región: " + region);
        System.out.println("Precio por kilo: " + precioPorKilo + " COP");
        System.out.println("Cantidad en kilos: " + cantidadEnKilos);
    }

    public double calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precioPorKilo -= this.precioPorKilo * (porcentaje / 100);
        } else {
            System.out.println("El porcentaje de descuento debe estar entre 0 y 100.");
        }
    }
}
