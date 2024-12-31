package proyectoact;

public class Cliente {
    private  String nombreC;
    private  String apellidosC;
    private String ciudadC;
    private String direccionC;
    private String telefonoC;
    private String correoElectronicoC;
    private String idC;
    private boolean estadoC;


    public Cliente(String idC, boolean estadoC, String nombreC, String apellidosC, String ciudadC, String direccionC, String telefonoC, String correoElectronicoC) {
        this.idC = idC;
        this.estadoC = estadoC;
        this.nombreC = nombreC;
        this.apellidosC = apellidosC;
        this.ciudadC = ciudadC;
        this.direccionC = direccionC;
        this.telefonoC = telefonoC;
        this.correoElectronicoC = correoElectronicoC;
    }

    public Cliente() {
        this.idC = "";
        this.estadoC = true;
        this.nombreC = "" ;
        this.apellidosC = "";
        this.ciudadC = "";
        this.direccionC = "";
        this.telefonoC = "";
        this.correoElectronicoC = "";
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getApellidosC() {
        return apellidosC;
    }

    public void setApellidosC(String apellidosC) {
        this.apellidosC = apellidosC;
    }

    public String getCiudadC() {
        return ciudadC;
    }

    public void setCiudadC(String ciudadC) {
        this.ciudadC = ciudadC;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

    public String getTelefonoC() {
        return telefonoC;
    }

    public void setTelefonoC(String telefonoC) {
        this.telefonoC = telefonoC;
    }

    public String getCorreoElectronicoC() {
        return correoElectronicoC;
    }

    public void setCorreoElectronicoC(String correoElectronicoC) {
        this.correoElectronicoC = correoElectronicoC;
    }

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC;
    }

    public boolean isEstadoC() {
        return estadoC;
    }

    public void setEstadoC(boolean estadoC) {
        this.estadoC = estadoC;
    }
}
    