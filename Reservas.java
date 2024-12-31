package proyectoact;
public class Reservas {
    private long idReserva;
    private String nombre;
    private int dia;
    private int mes;
    private int anio;
    private String servicio;
    private double monto;

    public void setIdReserva(long idReserva) {
        this.idReserva = idReserva;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public long getIdReserva() {
        return idReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public String getServicio() {
        return servicio;
    }

    public double getMonto() {
        return monto;
    }
    
}