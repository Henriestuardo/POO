package CreacionClassLib;

public class Libro {

    private String titulo;
    private String autor;
    private String editorial;
    private double precio;

    //Constructor sin parámetros
    public Libro(){

    }

    //Constructor con parametros
    public Libro(String titulo, String autor, String editorial, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    //Metodo para msotrar los detalles del libro
    public void mostrarDetalles(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Precio: " + precio + " Quetzales");
    }

    //Metodo para actualizar el precio
    public void actualizarPrecio(double nuevoPrecio){
        this.precio = nuevoPrecio;
        System.out.println("El nuevo precio del libro " + titulo + " es " + nuevoPrecio + " Quetzales");
    }

    //Getters y Setters
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}

    public void setAutor(String autor) {this.autor = autor;}

    public String getEditorial() {return editorial;}

    public void setEditorial(String editorial) {this.editorial = editorial;}

    public double getPrecio() {return precio;}

    public void setPrecio(double precio) {this.precio = precio;}
}
