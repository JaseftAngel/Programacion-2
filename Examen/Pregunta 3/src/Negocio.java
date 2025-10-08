public class Negocio {
    protected String nombre;
    protected double capital;
    protected String ubicacion;

    public Negocio(String nombre, double capital, String ubicacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.ubicacion = ubicacion;
    }

    public double getCapital() {
        return this.capital;
    }

    @Override
    public String toString() {
        return String.format("Negocio: %s | Capital: %.2f | Ubicación: %s",
                nombre, capital, ubicacion);
    }
}