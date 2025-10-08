class Salteñeria extends Negocio {
    private int nroRecetas;
    private int ventasDiarias;
    private int tipos;

    public Salteñeria(String nombre, double capital, String ubicacion, int nroRecetas, int ventasDiarias, int tipos) {
        super(nombre, capital, ubicacion);
        this.nroRecetas = nroRecetas;
        this.ventasDiarias = ventasDiarias;
        this.tipos = tipos;
    }

    public void mostrarVentas() {
        System.out.println("Ventas diarias: " + ventasDiarias + " salteñas (" + tipos + " tipos)");
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(" | Recetas: %d | Ventas diarias: %d | Tipos: %d", nroRecetas, ventasDiarias, tipos);
    }
}