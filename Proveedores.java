package proyectoact;

public class Proveedores {
    private String idP;
    private boolean estadoP;
    private String nombreP;
    private String ciudadP;
    private String direccionP;
    private String telefonoP;
    private String correoElectronicoP;

    // Constructor
    public Proveedores(String idP, boolean estadoP, String nombreP, String ciudadP, String direccionP, String telefonoP, String correoElectronicoP) {
        this.idP = idP;
        this.estadoP = estadoP;
        this.nombreP = nombreP;
        this.ciudadP = ciudadP;
        this.direccionP = direccionP;
        this.telefonoP = telefonoP;
        this.correoElectronicoP = correoElectronicoP;
    }
    
    public Proveedores() {
        this.idP = "";
        this.estadoP = true;
        this.nombreP = "";
        this.ciudadP = "";
        this.direccionP = "";
        this.telefonoP = "";
        this.correoElectronicoP = "";
    }

    public String getIdP() {
        return idP;
    }

    public boolean isEstadoP() {
        return estadoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public String getCiudadP() {
        return ciudadP;
    }

    public String getDireccionP() {
        return direccionP;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public String getCorreoElectronicoP() {
        return correoElectronicoP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }

    public void setEstadoP(boolean estadoP) {
        this.estadoP = estadoP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setCiudadP(String ciudadP) {
        this.ciudadP = ciudadP;
    }

    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }

    public void setCorreoElectronicoP(String correoElectronicoP) {
        this.correoElectronicoP = correoElectronicoP;
    }
    


}