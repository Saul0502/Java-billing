package proyectoact;

import javax.swing.JOptionPane;

public class CatalogoProveedor {

    private Proveedores[] proveedores = new Proveedores[100]; 
    private int x; 

    public void agregarProveedor() {
        for (x = 0; x < proveedores.length; x++) {
            if (proveedores[x] == null) { 
                Proveedores prov = new Proveedores();
                prov.setIdP(JOptionPane.showInputDialog("Ingrese el ID del proveedor:"));
                prov.setNombreP(JOptionPane.showInputDialog("Ingrese el nombre:"));
                prov.setCiudadP(JOptionPane.showInputDialog("Ingrese la ciudad:"));
                prov.setDireccionP(JOptionPane.showInputDialog("Ingrese la dirección:"));
                prov.setTelefonoP(JOptionPane.showInputDialog("Ingrese el teléfono:"));
                prov.setCorreoElectronicoP(JOptionPane.showInputDialog("Ingrese el correo electrónico:"));
                prov.setEstadoP(true); 

                proveedores[x] = prov;

                JOptionPane.showMessageDialog(null, "Proveedor agregado correctamente:\nNombre: " + prov.getNombreP());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No hay espacio");
    }

    public void mostrarProveedores() {
        boolean hayProveedores = false;
        String lista = "Catálogo de Proveedores:\n";

        for (x = 0; x < proveedores.length; x++) {
            if (proveedores[x] != null) {
                hayProveedores = true;
                lista += "ID: " + proveedores[x].getIdP() +
                         "\nNombre: " + proveedores[x].getNombreP() +
                         "\nCiudad: " + proveedores[x].getCiudadP() +
                         "\nDirección: " + proveedores[x].getDireccionP() +
                         "\nTeléfono: " + proveedores[x].getTelefonoP() +
                         "\nCorreo: " + proveedores[x].getCorreoElectronicoP() +
                         "\nEstado: " + (proveedores[x].isEstadoP() ? "Activo" : "Inactivo") +
                         "\n--------------------------\n";
            }
        }

        if (!hayProveedores) {
            JOptionPane.showMessageDialog(null, "No hay proveedores registrados");
        } else {
            JOptionPane.showMessageDialog(null, lista);
        }
    }

    public void buscarProveedor() {
        String idBuscado = JOptionPane.showInputDialog("Ingrese el ID del proveedor a buscar:");

        for (x = 0; x < proveedores.length; x++) {
            if (proveedores[x] != null && proveedores[x].getIdP().equals(idBuscado)) {
                JOptionPane.showMessageDialog(null, """
                                                     Información del proveedor:
                                                     ID: """ + proveedores[x].getIdP() +
                                                     "\nNombre: " + proveedores[x].getNombreP() +
                                                     "\nCiudad: " + proveedores[x].getCiudadP() +
                                                     "\nDirección: " + proveedores[x].getDireccionP() +
                                                     "\nTeléfono: " + proveedores[x].getTelefonoP() +
                                                     "\nCorreo: " + proveedores[x].getCorreoElectronicoP() +
                                                     "\nEstado: " + (proveedores[x].isEstadoP() ? "Activo" : "Inactivo"));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Proveedor no encontrado");
    }

    public void editarProveedor() {
        String idEditar = JOptionPane.showInputDialog("Ingrese el ID del proveedor que quiere editar:");
        for (x = 0; x < proveedores.length; x++) {
            if (proveedores[x] != null && proveedores[x].getIdP().equals(idEditar)) {
                proveedores[x].setNombreP(JOptionPane.showInputDialog("Ingrese el nuevo nombre del proveedor:", proveedores[x].getNombreP()));
                proveedores[x].setCiudadP(JOptionPane.showInputDialog("Ingrese la nueva ciudad del proveedor:", proveedores[x].getCiudadP()));
                proveedores[x].setDireccionP(JOptionPane.showInputDialog("Ingrese la nueva dirección del proveedor:", proveedores[x].getDireccionP()));
                proveedores[x].setTelefonoP(JOptionPane.showInputDialog("Ingrese el nuevo teléfono del proveedor:", proveedores[x].getTelefonoP()));
                proveedores[x].setCorreoElectronicoP(JOptionPane.showInputDialog("Ingrese el nuevo correo electrónico del proveedor:", proveedores[x].getCorreoElectronicoP()));

                JOptionPane.showMessageDialog(null, "Proveedor actualizado");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Proveedor no encontrado");
    }

    public void cambiarEstadoProveedor() {
        String idEstado = JOptionPane.showInputDialog("Ingrese el ID del proveedor cuyo estado desea cambiar:");
        for (x = 0; x < proveedores.length; x++) {
            if (proveedores[x] != null && proveedores[x].getIdP().equals(idEstado)) {
                proveedores[x].setEstadoP(!proveedores[x].isEstadoP());
                JOptionPane.showMessageDialog(null, "Estado cambiado exitosamente a: " +
                        (proveedores[x].isEstadoP() ? "Activo" : "Inactivo"));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Proveedor no encontrado.");
    }

    public boolean existeProveedor(String idProveedor) {
        for (x = 0; x < proveedores.length; x++) {
            if (proveedores[x] != null && proveedores[x].getIdP().equals(idProveedor)) {
                return true; 
            }
        }
        return false; 
    }

    public boolean existeProveedorPorNombre(String nombreProveedor) {
        for (x = 0; x < proveedores.length; x++) {
            if (proveedores[x] != null && proveedores[x].getNombreP().equalsIgnoreCase(nombreProveedor)) {
                return true;
            }
        }
        return false;
    }
}
