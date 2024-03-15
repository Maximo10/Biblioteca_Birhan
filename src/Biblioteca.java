import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Usuario> usuarios;
    ArrayList<Libro> libros;

    public Biblioteca(){
        usuarios = new ArrayList<>();
        libros = new ArrayList<>();
    }
    public void añadirUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public void añadirLibro(Libro libro){
        libros.add(libro);
    }

    public void enseñarLibrosDisponibles() {
        System.out.println("Libros disponibles:\n");
        for (Libro libro : libros) {
            if (libro.estaDisponible()) {
                System.out.println(libro.toString());
            }
        }
    }

    public void PedirLibro(Usuario usuario, Libro libro) {
        if (libros.contains(libro)) {
            System.out.println(usuario + " ha pedido prestado " + libro);
        } else {
            System.out.println("El libro no está disponible.");
        }
    }
}
