package proyectoact;

import javax.swing.JOptionPane;

public class generarReserva {

    private int x;
    private Reservas datos[] = new Reservas[100];
    private CatalogoClientes catalogoClientes;
    private CatalogoServicios catalogoServicios;

    public generarReserva(CatalogoServicios catalogoServicios, CatalogoClientes catalogoClientes) {
        this.catalogoServicios = catalogoServicios;
        this.catalogoClientes = catalogoClientes;
    }

    public void añadirReserva() {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == null) { 
                Reservas re = new Reservas();

                re.setIdReserva(Long.parseLong(JOptionPane.showInputDialog(null, "Digite el ID de la reservación:")));

                String idCliente;
                Cliente cliente;
                do {
                    idCliente = JOptionPane.showInputDialog(null, "Digite el ID del cliente:");
                    cliente = catalogoClientes.buscarCliente(idCliente);
                    if (cliente == null) {
                        JOptionPane.showMessageDialog(null, "no se encuentra el cliente");
                    }
                } while (cliente == null);
                re.setNombre(cliente.getNombreC() + " " + cliente.getApellidosC());

                re.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el día de la reserva:")));
                re.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el mes de la reserva:")));
                re.setAnio(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el año de la reserva:")));

                String idServicio;
                Servicio servicio;
                do {
                    idServicio = JOptionPane.showInputDialog(null, "Digite el ID del servicio reservado:");
                    servicio = catalogoServicios.buscarServicio(idServicio);
                    if (servicio == null) {
                        JOptionPane.showMessageDialog(null, "Servicio no encontrado, intente otra vez");
                    }
                } while (servicio == null);
                re.setServicio(servicio.getDescripcion());
                re.setMonto(servicio.getCosto());

                JOptionPane.showMessageDialog(null, "***RESERVACIÓN***\nMultiservicios Multi Me\n\n"
                        + "ID de la reservación: " + re.getIdReserva()
                        + "\nNombre del cliente: " + re.getNombre()
                        + "\nFecha de la reservación: " + re.getDia() + "/" + re.getMes() + "/" + re.getAnio()
                        + "\nServicio reservado: " + re.getServicio()
                        + "\nEl monto a pagar es de: ₡" + re.getMonto());

                datos[i] = re; 
                return; 
            }
        }

        JOptionPane.showMessageDialog(null, "No hay espacio"); 
    }

    public void modificarReserva() {
        long id = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el id de la reservación a modificar:"));
        for (Reservas re : datos) {
            if (re != null && re.getIdReserva() == id) {
                re.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el nuevo día de la reserva:")));
                re.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el nuevo mes de la reserva:")));
                re.setAnio(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el nuevo año de la reserva:")));

                JOptionPane.showMessageDialog(null, "Reserva modificada");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Reserva no encontrada");
    }

    public void cancelarReserva() {
        long id = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el id de la reservación a cancelar:"));
        for (x = 0; x < datos.length; x++) {
            if (datos[x] != null && datos[x].getIdReserva() == id) {
                datos[x] = null;
                JOptionPane.showMessageDialog(null, "Reserva cancelada");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Reserva no encontrada");
    }
}
