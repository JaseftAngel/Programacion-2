import java.io.*;
import java.util.ArrayList;

public class Consultorio implements Serializable {

    private ArrayList<Medico> medicos;
    private ArrayList<Consulta> consultas;

    public Consultorio() {
        medicos = new ArrayList<>();
        consultas = new ArrayList<>();
        cargarMedicos();
        cargarConsultas();
    }

    public void adicionarMedico(Medico m) {
        medicos.add(m);
        guardarMedicos();
    }

    public void adicionarConsulta(Consulta c) {
        consultas.add(c);
        guardarConsultas();
    }

    public void eliminarMedico(String nombre, String apellido) {
        int idEliminar = -1;

        for (Medico m : medicos) {
            if (m.nombreMed.equals(nombre) && m.apellidoMed.equals(apellido)) {
                idEliminar = m.idMed;
                break;
            }
        }

        if (idEliminar == -1) {
            System.out.println("Medico NO encontrado");
            return;
        }

        ArrayList<Medico> nuevaListaMed = new ArrayList<>();
        for (Medico m : medicos) {
            if (m.idMed != idEliminar) {
                nuevaListaMed.add(m);
            }
        }
        medicos = nuevaListaMed;

        ArrayList<Consulta> nuevaListaConsulta = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.idMed != idEliminar) {
                nuevaListaConsulta.add(c);
            }
        }
        consultas = nuevaListaConsulta;

        guardarMedicos();
        guardarConsultas();

        System.out.println("Medico y consultas eliminados correctamente.");
    }

    public void mostrarConsultorios() {
        for (Medico m : medicos) {
            System.out.println("\nMédico: " + m.nombreMed + " " + m.apellidoMed);
            System.out.println("Consultas:");

            for (Consulta c : consultas) {
                if (c.idMed == m.idMed) {
                    System.out.println(" - " + c.dia + "/" + c.mes + "/" + c.anio +
                            " | Paciente: " + c.nombrePaciente + " " + c.apellidoPaciente);
                }
            }
        }
    }

    public void mostrarConsultasEspeciales() {
        for (Consulta c : consultas) {
            if (c.esNavidad() || c.esAñoNuevo()) {
                System.out.println("Consulta especial: " +
                        c.dia + "/" + c.mes + "/" + c.anio +
                        " | Paciente: " + c.nombrePaciente + " " + c.apellidoPaciente +
                        " | Médico ID: " + c.idMed);
            }
        }
    }

    public void mostrarMedicosPorNombre(String nombre) {
        for (Medico m : medicos) {
            if (m.nombreMed.equals(nombre)) {
                System.out.println("Medico encontrado:");
                System.out.println(m.nombreMed + " " + m.apellidoMed + " | ID: " + m.idMed);
            }
        }
    }

    private void guardarMedicos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("medicos.dat"))) {
            for (Medico m : medicos) oos.writeObject(m);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarMedicos() {
        medicos.clear();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("medicos.dat"))) {
            while (true) {
                Medico m = (Medico) ois.readObject();
                medicos.add(m);
            }
        } catch (EOFException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void guardarConsultas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("consultas.dat"))) {
            for (Consulta c : consultas) oos.writeObject(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarConsultas() {
        consultas.clear();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("consultas.dat"))) {
            while (true) {
                Consulta c = (Consulta) ois.readObject();
                consultas.add(c);
            }
        } catch (EOFException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void guardarMedico(Medico m) {
        Consultorio c = new Consultorio();
        c.adicionarMedico(m);
    }

    public static void guardarConsulta(Consulta con) {
        Consultorio c = new Consultorio();
        c.adicionarConsulta(con);
    }

    public static ArrayList<Medico> leerMedicos() {
        Consultorio c = new Consultorio();
        return c.medicos;
    }

    public static ArrayList<Consulta> leerConsultas() {
        Consultorio c = new Consultorio();
        return c.consultas;
    }

    public static void eliminarMedicoPorNombre(String nombre, String apellido) {
        Consultorio c = new Consultorio();
        c.eliminarMedico(nombre, apellido);
    }

    public static void actualizarConsultasEspeciales() {
        Consultorio c = new Consultorio();
        c.mostrarConsultasEspeciales();
    }
}
