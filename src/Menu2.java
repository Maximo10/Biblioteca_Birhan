import java.util.Scanner;

//public class menu2 {
//    public static void main(String[] args) {
//        Biblioteca biblioteca = new Biblioteca();
//        Scanner scanner = new Scanner(System.in);
//
//        Usuario usuario1 = new Usuario("Carlos", "López", "555123456", "carlos@example.com");
//        Usuario usuario2 = new Usuario("Ana", "Martínez", "555987654", "ana@example.com");
//
//        biblioteca.añadirUsuario(usuario1);
//        biblioteca.añadirUsuario(usuario2);
//
//        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "9788420402279");
//        Libro libro2 = new Libro("1984", "George Orwell", "9788499890944");
//        Libro libro3 = new Libro("Orgullo y prejuicio", "Jane Austen", "9788497940904");
//
//        biblioteca.añadirLibro(libro1);
//        biblioteca.añadirLibro(libro2);
//        biblioteca.añadirLibro(libro3);
//
//        int opcion;
//        do {
//            System.out.println("Menú:");
//            System.out.println("1. Acceder a un usuario");
//            System.out.println("2. Ver libros disponibles");
//            System.out.println("3. Ver libros pendientes de devolver");
//            System.out.println("4. Pedir un libro");
//            System.out.println("5. Devolver un libro");
//            System.out.println("6. Salir");
//            System.out.print("Ingrese su opción: ");
//            opcion = scanner.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    System.out.println("Ingrese su nombre de usuario");
//                    String NombreUsuario = scanner.next();
//                    for (Usuario usuario: biblioteca.usuarios) {
//                        if (usuario.getNombre().equals(NombreUsuario)){
//                            System.out.println(usuario.toString());
//                            break;
//                        }
//                    }
//                    break;
//                case 2:
//                    biblioteca.enseñarLibrosDisponibles();
//                    break;
//                case 3:
//                    System.out.println("Ingrese su nombre de usuario");
//                    String nombreUsuario= scanner.nextLine();
//                    for (Usuario usuario:biblioteca.usuarios){
//                        if (usuario.getNombre().equals(nombreUsuario)){
//                            usuario.EnseñarLibrosPendientes();
//                            break;
//                        }
//                    }
//                    break;
//                case 4:
//                    System.out.print("Ingrese el nombre del usuario: ");
//                    String Nombreusuario = scanner.nextLine();
//                    System.out.print("Ingrese el título del libro: ");
//                    String TituloLibro = scanner.nextLine();
//                    for (Usuario usuario : biblioteca.usuarios) {
//                        if (usuario.getNombre().equals(Nombreusuario)) {
//                            for (Libro libro : biblioteca.libros) {
//                                if (libro.toString().equals(TituloLibro)) {
//                                    biblioteca.PedirLibro(usuario,libro);
//                                    break;
//                                }
//                            }
//                            break;
//                        }
//                    }
//                    break;
//                case 5:
//                    System.out.print("Ingrese el nombre del usuario: ");
//                    nombreUsuario = scanner.next();
//                    System.out.print("Ingrese el título del libro: ");
//                    TituloLibro = scanner.next();
//                    for (Usuario usuario : biblioteca.usuarios) {
//                        if (usuario.getNombre().equals(nombreUsuario)) {
//                            for (Libro libro : usuario.getLibrosPendientes()) {
//                                if (libro.toString().equals(TituloLibro)) {
//                                    usuario.DevolverLibro(libro);
//                                    libro.setDisponible(true);
//                                    System.out.println("El usuario" + usuario + " devolvió " + libro);
//                                    break;
//                                }
//                            }
//                            break;
//                        }
//                    }
//                    break;
//                case 6:
//                    System.out.println("Saliendo del programa...");
//                    break;
//                default:
//                    System.out.println("Opción inválida, por favor ingrese una opción válida.");
//                    break;
//            }
//        } while (opcion != 6);
//    }
//}
//