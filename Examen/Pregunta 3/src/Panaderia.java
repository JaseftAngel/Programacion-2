class Panaderia extends Negocio {
    private int nroHornos;
    private int produccionDia;
    private String tipos;

    public Panaderia(String nombre, double capital, String ubicacion, int nroHornos, int produccionDia, String tipos) {
        super(nombre, capital, ubicacion);
        this.nroHornos = nroHornos;
        this.produccionDia = produccionDia;
        this.tipos = tipos;
    }

    public void mostrarProduccion() {
        System.out.println("Producción diaria: " + produccionDia + " panes (" + tipos + ")");
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(" | Hornos: %d | Producción: %d | Tipos: %s", nroHornos, produccionDia, tipos);
    }
}