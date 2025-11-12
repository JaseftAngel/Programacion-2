public class Main {
    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca("Biblioteca Central UMSA", "Lun-Vie", "08:00", "18:00");

        Autor autor1 = new Autor("Gabriel García Márquez", "Colombia");
        Autor autor2 = new Autor("Julio Verne", "Francia");
        biblio.agregarAutor(autor1);
        biblio.agregarAutor(autor2);

        Libro libro1 = new Libro("Cien Años de Soledad", "ISBN-001",
                new String[]{"Capítulo 1: Macondo", "Capítulo 2: José Arcadio Buendía"});
        Libro libro2 = new Libro("Viaje al Centro de la Tierra", "ISBN-002",
                new String[]{"Capítulo 1: Descubrimiento", "Capítulo 2: Aventura Subterránea"});
        biblio.agregarLibro(libro1);
        biblio.agregarLibro(libro2);

        Estudiante est1 = new Estudiante("202501", "Juan Pérez");
        Estudiante est2 = new Estudiante("202502", "María López");

        biblio.prestarLibro(est1, libro1);
        biblio.prestarLibro(est2, libro2);

        biblio.mostrarEstado();

        System.out.println("\n=== Lectura del libro ===");
        libro1.leer();

        biblio.cerrarBiblioteca();
    }
}