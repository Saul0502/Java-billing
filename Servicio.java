package proyectoact;

public class Servicio {
    private String id;
    private String descripcion;
    private String proveedorId;
    private int duracion;
    private double costo;
    private boolean activo;

    public Servicio(String id, String descripcion, String proveedorId, int duracion, double costo) {
        this.id = id;
        this.descripcion = descripcion;
        this.proveedorId = proveedorId;
        this.duracion = duracion;
        this.costo = costo;
        this.activo = true;
    }
    public Servicio() {
        this.id = "";
        this.descripcion = "";
        this.proveedorId = "";
        this.duracion = 0;
        this.costo = 0;
        this.activo = true;
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getProveedorId() {
        return proveedorId;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProveedorId(String proveedorId) {
        this.proveedorId = proveedorId;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isActivo() {
        return activo;
    }
    
    }