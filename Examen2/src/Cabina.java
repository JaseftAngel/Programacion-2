public class Cabina {

    private int nroCabina;
    private Persona personasAbordo[] = new Persona[10];
    private int cantidad = 0;

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
    }

    // Insiso A
    public boolean agregarPersona(Persona p) {
        if (cantidad == 10) return false;
        float pesoActual = getPesoTotal();
        if (pesoActual + p.getPeso() > 850) return false;

        personasAbordo[cantidad++] = p;
        return true;
    }

    public float getPesoTotal() {
        float total = 0;
        for (int i = 0; i < cantidad; i++)
            total += personasAbordo[i].getPeso();
        return total;
    }

    public int getCantidadPersonas() {
        return cantidad;
    }

    public Persona[] getPersonas() {
        return personasAbordo;
    }

    @Override
    public String toString() {
        return "Cabina " + nroCabina + " Personas=" + cantidad + " Peso=" + getPesoTotal();
    }
}
