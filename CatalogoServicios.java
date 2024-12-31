package proyectoact;

import javax.swing.JOptionPane;

public class CatalogoServicios {

    private int x;
    private Servicio servicios[] = new Servicio[100];
    private CatalogoProveedor catalogoProveedores2;

    public CatalogoServicios(CatalogoProveedor catalogoProveedores2) {
        this.catalogoProveedores2 = catalogoProveedores2;
    }

    public void llenarDatos() {
        for (int i = 0; i < servicios.length; i++) {
            if (servicios[i] == null) { 
                Servicio serv = new Servicio();
                serv.setId(JOptionPane.showInputDialog("Ingrese el ID del servicio:"));
                serv.setDescripcion(JOptionPane.showInputDialog("Ingrese la descripción del servicio:"));

                String proveedorId;
                do {
                    proveedorId = JOptionPane.showInputDialog("Ingrese el ID del proveedor:");
                    if (!catalogoProveedores2.existeProveedor(proveedorId)) {
                        JOptionPane.showMessageDialog(null, "El proveedor no existe, ingrese de nuevo el ID");
                    }
                } while (!catalogoProveedores2.existeProveedor(proveedorId));
                serv.setProveedorId(proveedorId);

                serv.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración en minutos:")));
                serv.setCosto(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del servicio:")));
                serv.setActivo(true);

                servicios[i] = serv; 
                JOptionPane.showMessageDialog(null, "Servicio agregado correctamente:\nID: " + serv.getId());
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "No hay espacio"); 
    }

    public void mostrarElementos() {
        String s = "";
        for (x = 0; x < servicios.length; x++) {
            if (servicios[x] != null) {
                s += "ID: " + servicios[x].getId()
                        + "\nDescripción: " + servicios[x].getDescripcion()
                        + "\nDuración: " + servicios[x].getDuracion() + " minutos"
                        + "\nCosto: $" + servicios[x].getCosto()
                        + "\nProveedor ID: " + servicios[x].getProveedorId()
                        + "\nEstado: " + (servicios[x].isActivo() ? "Activo" : "Inactivo") + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Lista de Servicios:\n" + s);
    }

    public void buscarServicio() {
        String idBuscar = JOptionPane.showInputDialog("Ingrese el ID del servicio que quiere buscar:");
        for (x = 0; x < servicios.length; x++) {
            if (servicios[x] != null && servicios[x].getId().equals(idBuscar)) {
                JOptionPane.showMessageDialog(null,
                        "Información del Servicio:\n"
                        + "ID: " + servicios[x].getId()
                        + "\nDescripción: " + servicios[x].getDescripcion()
                        + "\nDuración: " + servicios[x].getDuracion() + " minutos"
                        + "\nCosto: $" + servicios[x].getCosto()
                        + "\nProveedor ID: " + servicios[x].getProveedorId()
                        + "\nEstado: " + (servicios[x].isActivo() ? "Activo" : "Inactivo"));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Servicio no encontrado");
    }

    public void modificarServicio() {
        String idBuscar = JOptionPane.showInputDialog("Ingrese el ID del servicio que desea modificar:");
        for (x = 0; x < servicios.length; x++) {
            if (servicios[x] != null && servicios[x].getId().equals(idBuscar)) {
                servicios[x].setId(JOptionPane.showInputDialog("Nuevo ID del servicio:", servicios[x].getId()));
                servicios[x].setDescripcion(JOptionPane.showInputDialog("Nueva descripción:", servicios[x].getDescripcion()));
                servicios[x].setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Nueva duración en minutos:", servicios[x].getDuracion())));
                servicios[x].setCosto(Double.parseDouble(JOptionPane.showInputDialog("Nuevo costo:", servicios[x].getCosto())));
                JOptionPane.showMessageDialog(null, "Servicio modificado exitosamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Servicio no encontrado");
    }

    public void modificarEstado() {
        String idBuscar = JOptionPane.showInputDialog("Ingrese el ID del servicio al que desea cambiar el estado:");
        for (x = 0; x < servicios.length; x++) {
            if (servicios[x] != null && servicios[x].getId().equals(idBuscar)) {
                if (servicios[x].isActivo()) {
                    servicios[x].setActivo(false);
                } else {
                    servicios[x].setActivo(true);
                }
                JOptionPane.showMessageDialog(null, "¡Estado del servicio modificado!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Servicio no encontrado");
    }

    public boolean existeServicio(String idServicio) {
        for (int x = 0; x < servicios.length; x++) {
            if (servicios[x] != null && servicios[x].getId().equals(idServicio)) {
                return true;
            }
        }
        return false;
    }

    public Servicio buscarServicio(String idServicio) {
        for (Servicio servicio : servicios) {
            if (servicio.getId().equals(idServicio)) {
                return servicio;
            }
        }
        return null;
    }

    public Servicio[] getServicios() {
        return servicios;
    }

}
