import java.util.*;

public class Libro {
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;

    public Libro(String titulo, String isbn, String[] contenidoPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
        for (int i = 0; i < contenidoPaginas.length; i++) {
            this.paginas.add(new Pagina(i + 1, contenidoPaginas[i]));
        }
    }

    public void leer() {
        System.out.println("Leyendo \"" + titulo + "\":");
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }

    @Override
    public String toString() {
        return titulo + " (ISBN: " + isbn + ")";
    }

    class Pagina {
        private int numero;
        private String contenido;

        public Pagina(int numero, String contenido) {
            this.numero = numero;
            this.contenido = contenido;
        }

        public void mostrarPagina() {
            System.out.println("Página " + numero + ": " + contenido);
        }

        @Override
        public String toString() {
            return "Pág. " + numero;
        }
    }
}