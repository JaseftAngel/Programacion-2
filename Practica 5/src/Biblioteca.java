import java.util.*;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario(dias, horaApertura, horaCierre);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void prestarLibro(Estudiante estudiante, Libro libro) {
        Prestamo p = new Prestamo(estudiante, libro);
        prestamos.add(p);
        System.out.println(" Préstamo creado con éxito para " + estudiante + " (" + libro + ")");
    }

    public void mostrarEstado() {
        System.out.println("\n=== ESTADO DE LA BIBLIOTECA: " + nombre + " ===");
        horario.mostrarHorario();

        System.out.println("\nAutores registrados:");
        for (Autor a : autores) System.out.println(" - " + a);

        System.out.println("\nLibros disponibles:");
        for (Libro l : libros) System.out.println(" - " + l);

        System.out.println("\nPréstamos activos:");
        if (prestamos.isEmpty()) System.out.println(" - Ninguno");
        else for (Prestamo p : prestamos) p.mostrarInfo();
    }

    public void cerrarBiblioteca() {
        System.out.println("\n Cerrando biblioteca " + nombre + "...");
        prestamos.clear();
        System.out.println("Todos los préstamos han sido eliminados. ¡Hasta mañana!");
    }

    class Horario {
        private String diasApertura;
        private String horaApertura;
        private String horaCierre;

        public Horario(String diasApertura, String horaApertura, String horaCierre) {
            this.diasApertura = diasApertura;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }

        public void mostrarHorario() {
            System.out.println("Horario: " + diasApertura + " | " + horaApertura + " - " + horaCierre);
        }
    }
}
