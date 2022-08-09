package poo.tareaProyectoCatalogo;

import java.util.Date;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion = new Date();
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String autor, String titulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }
    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    @Override
    public String getAutor() {
        return autor;
    }
    @Override
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.95;
    }
}
