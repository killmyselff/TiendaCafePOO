package src;

public class TiendaCafe {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 50000, 10);
        Cafe cafe2 = new Cafe("Café de Antioquia", "Antioquia", 45000, 20);
        Cafe cafe3 = new Cafe("Café del Huila", "Huila", 55000, 15);

        System.out.println("Información de los cafés:");
        System.out.println("------------------------");
        cafe1.mostrarInformacion();
        System.out.println("Precio total: " + cafe1.calcularPrecioTotal() + " COP");
        System.out.println("------------------------");
        cafe2.mostrarInformacion();
        System.out.println("Precio total: " + cafe2.calcularPrecioTotal() + " COP");
        System.out.println("------------------------");
        cafe3.mostrarInformacion();
        System.out.println("Precio total: " + cafe3.calcularPrecioTotal() + " COP");

        System.out.println("\nActualizando la cantidad del café de Nariño...");
        cafe1.actualizarCantidad(5);
        System.out.println("------------------------");
        cafe1.mostrarInformacion();

        System.out.println("\nAplicando descuento al café de Antioquia...");
        cafe2.aplicarDescuento(10); // 10% de descuento
        System.out.println("------------------------");
        cafe2.mostrarInformacion();
    }
}
