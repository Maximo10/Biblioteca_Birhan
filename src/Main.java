import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        Usuario usuario1 = new Usuario("Carlos", "López", "555123456", "carlos@example.com");
        Usuario usuario2 = new Usuario("Ana", "Martínez", "555987654", "ana@example.com");
        Usuario usuario3 = new Usuario("Juan", "Perez", "123456789", "juan@example.com");
        Usuario usuario4 = new Usuario("Maria", "Gomez", "987654321", "maria@example.com");

        biblioteca.añadirUsuario(usuario1);
        biblioteca.añadirUsuario(usuario2);

        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "9788420402279", true);
        Libro libro2 = new Libro("1984", "George Orwell", "9788499890944", true);
        Libro libro3 = new Libro("Orgullo y prejuicio", "Jane Austen", "9788497940904", true);

        biblioteca.añadirLibro(libro1);
        biblioteca.añadirLibro(libro2);
        biblioteca.añadirLibro(libro3);

        int opcion;
        do {
            System.out.println("\n Menú Principal:");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String nombre1 = scanner.nextLine();
                    System.out.println("Ingrese su contraseña:");
                    String contrasena = scanner.nextLine();
                    for (Usuario usuario : biblioteca.usuarios) {
                        if (usuario.getNombre().equals(nombre1)) {
                            if (usuario.getTelefono().equals(contrasena)) {
                                System.out.println("Bienvenido/a " + usuario.getNombre());
                                Scanner scanner2 = new Scanner(System.in);
                                int secundario;
                                do {
                                    System.out.println("Menú:");
                                    System.out.println("1. Acceder a un usuario");
                                    System.out.println("2. Ver libros disponibles");
                                    System.out.println("3. Ver libros pendientes de devolver");
                                    System.out.println("4. Pedir un libro");
                                    System.out.println("5. Devolver un libro");
                                    System.out.println("6. Salir");
                                    System.out.print("Ingrese su opción: ");

                                    secundario = scanner2.nextInt();

                                    switch (secundario) {
                                        case 1:
                                            System.out.print(usuario.toString());
                                            break;
                                        case 2:
                                            biblioteca.enseñarLibrosDisponibles();
                                            break;
                                        case 3:
                                            System.out.println("Ingrese su nombre de usuario");
                                            String nombreUsuario = scanner.nextLine();
                                            for (Usuario usuariofor : biblioteca.usuarios) {
                                                if (usuariofor.getNombre().equals(nombreUsuario)) {
                                                    usuariofor.EnseñarLibrosPendientes();
                                                    break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            System.out.print("Ingrese el nombre del usuario: ");
                                            String Nombreusuario = scanner.nextLine();
                                            System.out.print("Ingrese el título del libro: ");
                                            String TituloLibro = scanner.nextLine();
                                            for (Usuario usuariofor : biblioteca.usuarios) {
                                                if (usuariofor.getNombre().equals(Nombreusuario)) {
                                                    for (Libro libro : biblioteca.libros) {
                                                        if (libro.toString().equals(TituloLibro) && libro.estaDisponible()) {
                                                            biblioteca.PedirLibro(usuariofor, libro);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                        case 5:
                                            System.out.print("Ingrese el nombre del usuario: ");
                                            nombreUsuario = scanner.next();
                                            System.out.print("Ingrese el título del libro: ");
                                            TituloLibro = scanner.next();
                                            for (Usuario usuario5 : biblioteca.usuarios) {
                                                if (usuario.getNombre().equals(nombreUsuario)) {
                                                    for (Libro libro : usuario.getLibrosPendientes()) {
                                                        if (libro.toString().equals(TituloLibro)) {
                                                            usuario.DevolverLibro(libro);
                                                            libro.setDisponible(true);
                                                            System.out.println("El usuario" + usuario + " devolvió " + libro);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                        case 6:
                                            System.out.println("Saliendo del programa...");
                                            break;
                                        default:
                                            System.out.println("Opción inválida, por favor ingrese una opción válida.");
                                    }
                                } while (secundario != 6);
                                scanner2.close();

                            } else {
                                System.out.println("Usuario  o contrasenha incorrecta");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese un nuevo nombre:");
                    String nuevo_nombre = scanner.nextLine();
                    System.out.println("Ingrese un nuevo apellido:");
                    String nuevo_apellido = scanner.nextLine();
                    System.out.println("Ingrese un nuevo telefono:");
                    String nuevo_telefono = scanner.nextLine();
                    System.out.println("Ingrese un nuevo correo:");
                    String nuevo_email = scanner.nextLine();

                    Usuario nuevo_usuario = new Usuario(nuevo_nombre, nuevo_apellido, nuevo_telefono, nuevo_email);
                    biblioteca.añadirUsuario(nuevo_usuario);
                    System.out.print(nuevo_usuario.toString());
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}
