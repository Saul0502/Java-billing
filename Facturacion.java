package proyectoact;

import javax.swing.JOptionPane;

public class Facturacion {

    private Facturacion facturas[] = new Facturacion[100];
    private CatalogoClientes clientes3;
    private CatalogoServicios catalogoServicios3;

    public Facturacion() {
    }

    public Facturacion(CatalogoClientes clientes3, CatalogoServicios catalogoServicios3) {
        this.catalogoServicios3 = catalogoServicios3;
        this.clientes3 = clientes3;
    }

    public void agregarFact() {
        for (int i = 0; i < facturas.length; i++) {
            if (facturas[i] == null) { 
                Facturacion nf = new Facturacion(); 

                String idCliente = JOptionPane.showInputDialog(null, "Digite el ID del cliente:");
                Cliente cliente = clientes3.buscarCliente(idCliente); 
                
                if (cliente != null) {
                    JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.getNombreC() + " " + cliente.getApellidosC());
                    
                    String clienteNombre = cliente.getNombreC() + " " + cliente.getApellidosC();
                    String clienteTelefono = cliente.getTelefonoC();
                    String clienteCorreo = cliente.getCorreoElectronicoC();

                    String idServicio = JOptionPane.showInputDialog(null, "Digite el ID del servicio:");
                    Servicio servicio = catalogoServicios3.buscarServicio(idServicio); 

                    if (servicio != null) {
                        double costoServicio = servicio.getCosto();
                        String descripcionServicio = servicio.getDescripcion();

                        JOptionPane.showMessageDialog(null, "***Factura***\nMultiservicios Multi Me\n\n"
                                + "Nombre del cliente: " + clienteNombre
                                + "\nTeléfono: " + clienteTelefono
                                + "\nCorreo: " + clienteCorreo
                                + "\n\nDescripción del servicio: " + descripcionServicio
                                + "\nCosto del servicio: ₡" + costoServicio);

                        facturas[i] = nf;

                        JOptionPane.showMessageDialog(null, "Factura agregada");
                        return; 
                    } else {
                        JOptionPane.showMessageDialog(null, "Servicio no encontrado");
                        return; 
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    return; 
                }
            }
        }
        JOptionPane.showMessageDialog(null, "No hay espacio disponible");
    }
}
