class Peluqueria extends Negocio {
    private int nroEmpleados;
    private String servicios;
    private int nroCortes;

    public Peluqueria(String nombre, double capital, String ubicacion, int nroEmpleados, String servicios, int nroCortes) {
        super(nombre, capital, ubicacion);
        this.nroEmpleados = nroEmpleados;
        this.servicios = servicios;
        this.nroCortes = nroCortes;
    }

    public void mostrarServicios() {
        System.out.println("Servicios ofrecidos: " + servicios + " | Cortes diarios: " + nroCortes);
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(" | Empleados: %d | Servicios: %s | Cortes: %d", nroEmpleados, servicios, nroCortes);
    }
}