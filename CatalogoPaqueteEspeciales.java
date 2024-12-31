package proyectoact;
import javax.swing.JOptionPane;

public class CatalogoPaqueteEspeciales {

    private PaqueteEspecial[] paquetes = new PaqueteEspecial[100]; 
    private int contador = 0; 
    private int x; 
    private  CatalogoServicios catalogoServicios; 
    private  CatalogoProveedor catalogoProveedores; 

    public CatalogoPaqueteEspeciales(CatalogoServicios catalogoServicios, CatalogoProveedor catalogoProveedores) {
        this.catalogoServicios = catalogoServicios;
        this.catalogoProveedores = catalogoProveedores;
    }

    public void agregarPaquete() {
        if (contador >= paquetes.length) {
            JOptionPane.showMessageDialog(null, "No hay espacio");
            return;
        }

        PaqueteEspecial paquete = new PaqueteEspecial();

        String nombreProveedor;
        do {
            nombreProveedor = JOptionPane.showInputDialog("Ingrese el nombre del proveedor:");
            if (!catalogoProveedores.existeProveedorPorNombre(nombreProveedor)) {
                JOptionPane.showMessageDialog(null, "Proveedor no encontrado");
            }
        } while (!catalogoProveedores.existeProveedorPorNombre(nombreProveedor));
        paquete.setNombreProveedor(nombreProveedor);

        String idServicio;
        do {
            idServicio = JOptionPane.showInputDialog("Ingrese el ID del servicio:");
            if (!catalogoServicios.existeServicio(idServicio)) {
                JOptionPane.showMessageDialog(null, "Servicio no encontrado");
            }
        } while (!catalogoServicios.existeServicio(idServicio));
        paquete.setIdServicio(idServicio);

        paquete.setIdE(JOptionPane.showInputDialog("Ingrese el ID del paquete especial:"));
        paquete.setDescripArticuloE(JOptionPane.showInputDialog("Ingrese la descripción del paquete:"));
        paquete.setActivo(true);

        paquetes[contador] = paquete;
        contador++;

        JOptionPane.showMessageDialog(null, "Paquete especial agregado");
    }

    public void mostrarPaquetes() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No hay paquetes especiales registrados");
            return;
        }

        String lista = "Catálogo de Paquetes Especiales:\n";
        for (x = 0; x < contador; x++) {
            lista += "ID: " + paquetes[x].getIdE() +
                     "\nDescripción: " + paquetes[x].getDescripArticuloE() +
                     "\nActivo: " + (paquetes[x].isActivo() ? "Sí" : "No") +
                     "\nID Servicio: " + paquetes[x].getIdServicio() +
                     "\nNombre Proveedor: " + paquetes[x].getNombreProveedor() +
                     "\n-----------------------------\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public void editarPaquete() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No hay paquetes especiales para editar");
            return;
        }

        String idEditar = JOptionPane.showInputDialog("Ingrese el ID del paquete especial que desea editar:");
        for (x = 0; x < contador; x++) {
            if (paquetes[x].getIdE().equals(idEditar)) {
                paquetes[x].setIdE(JOptionPane.showInputDialog("Nuevo ID del paquete:", paquetes[x].getIdE()));
                paquetes[x].setDescripArticuloE(JOptionPane.showInputDialog("Nueva descripción del paquete:", paquetes[x].getDescripArticuloE()));
                JOptionPane.showMessageDialog(null, "Paquete especial editado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Paquete especial no encontrado");
    }
}
