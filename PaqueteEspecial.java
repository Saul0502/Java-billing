package proyectoact;

public class PaqueteEspecial {
    private String idE;
    private String descripArticuloE;
    private boolean activo;
    private String idServicio;
    private String nombreProveedor;

    public PaqueteEspecial(String idE, String descripArticuloE, boolean activo, String idServicio, String descripcionServicio, String nombreProveedor) {
        this.idE = idE;
        this.activo = activo;
        this.idServicio = idServicio;
        this.descripArticuloE = descripcionServicio;
        this.nombreProveedor = nombreProveedor;
    }
    

    public PaqueteEspecial() {
        this.idE = "";
        this.descripArticuloE = "";
        this.activo = true;
        this.idServicio = "";
        this.nombreProveedor = "";
    
} 

    public String getIdE() {
        return idE;
    }

    public void setIdE(String idE) {
        this.idE = idE;
    }

    public String getDescripArticuloE() {
        return descripArticuloE;
    }

    public void setDescripArticuloE(String descripArticuloE) {
        this.descripArticuloE = descripArticuloE;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    
}