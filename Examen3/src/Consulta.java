import java.io.Serializable;

public class Consulta implements Serializable {
    public int ci;
    public String nombrePaciente;
    public String apellidoPaciente;
    public int idMed;
    public int dia;
    public String mes;
    public int anio;

    public Consulta(int ci, String nombre, String apellido, int idMed,
                    int dia, String mes, int anio) {
        this.ci = ci;
        this.nombrePaciente = nombre;
        this.apellidoPaciente = apellido;
        this.idMed = idMed;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean esNavidad() { return (dia == 25 && mes.equals("diciembre")); }
    public boolean esAñoNuevo() { return (dia == 1 && mes.equals("enero")); }

    @Override
    public String toString() {
        return ci + " - " + nombrePaciente + " " + apellidoPaciente +
                "  |  Medico: " + idMed + "  | Fecha: " +
                dia + "/" + mes + "/" + anio;
    }
}