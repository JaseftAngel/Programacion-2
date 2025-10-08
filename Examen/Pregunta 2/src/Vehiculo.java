class Vehiculo {
    private String placa;
    private String conductor;
    private int horaEntrada, horaSalida;

    public Vehiculo(String placa, String conductor, int horaEntrada, int horaSalida) {
        this.placa = placa;
        this.conductor = conductor;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getPlaca() { return placa; }
    public int getHoras() { return horaSalida - horaEntrada; }
}