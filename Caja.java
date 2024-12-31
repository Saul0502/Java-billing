
package proyectoact;

import javax.swing.JOptionPane;

public class Caja {

    private CatalogoServicios catalogoServicios;

    public Caja(CatalogoServicios catalogoServicios) {
        this.catalogoServicios = catalogoServicios;
    }

    public void mostrarIngresosDelDia() {
        double totalIngresos = 0;
        Servicio[] servicios = catalogoServicios.getServicios();

        for (Servicio servicio : servicios) {
            if (servicio != null && servicio.isActivo()) {
                totalIngresos += servicio.getCosto();
            }
        }

        JOptionPane.showMessageDialog(null, "Los ingresos totales del día fueron: ₡" + totalIngresos);
    }

    public Servicio[] getServicios() {
        return catalogoServicios.getServicios();
    }
}
