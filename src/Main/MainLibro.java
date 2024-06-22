package Main;

import CreacionClassLib.Libro;

public class MainLibro {
    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros
        Libro libro1 = new Libro();

        // Muestra los detalles
        System.out.println("Los detalles del libro 1 son:");
        libro1.mostrarDetalles();

        // Crea un objeto 'libro2' utilizando el constructor con parámetros
        Libro libro2 = new Libro("Don Quijote de la mancha", "Miguel de Cervantes", "Herrero Hermanos Saturnino Calleja", 280);

        // Muestra los detalles de libro2
        System.out.println("\nDetalles del libro2 son: ");
        libro2.mostrarDetalles();

        // Actualiza el precio de libro2
        libro2.actualizarPrecio(300);

    }
}
