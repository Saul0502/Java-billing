package proyectoact;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class CatalogoClientes {

    public Cliente[] clientes = new Cliente[100];
    private int x;

   public void agregarCliente() {
    for (int i = 0; i < clientes.length; i++) {
        if (clientes[i] == null) { 
            Cliente cliente = new Cliente();

            String id;
            boolean idExistente;
            do {
                id = JOptionPane.showInputDialog("Ingrese el ID del cliente:");
                idExistente = existeCliente(id);

                if (idExistente) {
                    JOptionPane.showMessageDialog(null, "El ID ya existe, ingrese uno nuevo");
                }
            } while (idExistente); 

            cliente.setIdC(id);
            cliente.setEstadoC(true); 
            cliente.setNombreC(JOptionPane.showInputDialog("Ingrese el nombre del cliente:"));
            cliente.setApellidosC(JOptionPane.showInputDialog("Ingrese los apellidos del cliente:"));
            cliente.setCiudadC(JOptionPane.showInputDialog("Ingrese la ciudad:"));
            cliente.setDireccionC(JOptionPane.showInputDialog("Ingrese la dirección:"));
            cliente.setTelefonoC(JOptionPane.showInputDialog("Ingrese el numero de teléfono:"));
            cliente.setCorreoElectronicoC(JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente:"));

            clientes[i] = cliente; 
            JOptionPane.showMessageDialog(null, "Cliente agregado");
            return; 
        }
    }
    JOptionPane.showMessageDialog(null, "No hay espacio");
}

    public void mostrarClientes() {
        String s = "Catálogo de Clientes:\n";
        for (x = 0; x < clientes.length; x++) {
            if (clientes[x] != null) { 
                s += "ID: " + clientes[x].getIdC()
                        + "\nNombre: " + clientes[x].getNombreC() + " " + clientes[x].getApellidosC()
                        + "\nCiudad: " + clientes[x].getCiudadC()
                        + "\nDirección: " + clientes[x].getDireccionC()
                        + "\nTeléfono: " + clientes[x].getTelefonoC()
                        + "\nCorreo: " + clientes[x].getCorreoElectronicoC()
                        + "\nEstado: " + (clientes[x].isEstadoC() ? "Activo" : "Inactivo") + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }

    public void buscarCliente() {
        String idBuscar = JOptionPane.showInputDialog("Ingrese el ID del cliente que desea buscar:");
        for (x = 0; x < clientes.length; x++) {
            if (clientes[x] != null && clientes[x].getIdC().equals(idBuscar)) {
                JOptionPane.showMessageDialog(null,
                        "Información del Cliente:\n"
                        + "ID: " + clientes[x].getIdC()
                        + "\nNombre: " + clientes[x].getNombreC() + " " + clientes[x].getApellidosC()
                        + "\nCiudad: " + clientes[x].getCiudadC()
                        + "\nDirección: " + clientes[x].getDireccionC()
                        + "\nTeléfono: " + clientes[x].getTelefonoC()
                        + "\nCorreo: " + clientes[x].getCorreoElectronicoC()
                        + "\nEstado: " + (clientes[x].isEstadoC() ? "Activo" : "Inactivo"));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
    }

    public void editarCliente() {
        String idBuscar = JOptionPane.showInputDialog("Ingrese el ID del cliente que desea editar:");
        for (x = 0; x < clientes.length; x++) {
            if (clientes[x] != null && clientes[x].getIdC().equals(idBuscar)) {
                clientes[x].setCiudadC(JOptionPane.showInputDialog("Ingrese la ciudad nueva:", clientes[x].getCiudadC()));
                clientes[x].setDireccionC(JOptionPane.showInputDialog("Ingrese la dirección nueva:", clientes[x].getDireccionC()));
                clientes[x].setTelefonoC(JOptionPane.showInputDialog("Ingrese el teléfono nuevo:", clientes[x].getTelefonoC()));
                clientes[x].setCorreoElectronicoC(JOptionPane.showInputDialog("Ingrese el nuevo correo:", clientes[x].getCorreoElectronicoC()));
                JOptionPane.showMessageDialog(null, "Cliente editado");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
    }

    public void modificarEstado() {
        String idBuscar = JOptionPane.showInputDialog("Ingrese el ID del cliente que desea activar/inactivar:");
        for (x = 0; x < clientes.length; x++) {
            if (clientes[x] != null && clientes[x].getIdC().equals(idBuscar)) {
                clientes[x].setEstadoC(!clientes[x].isEstadoC());
                JOptionPane.showMessageDialog(null, "Estado del cliente modificado");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
    }

    public boolean existeCliente(String idCliente) {
    for (Cliente cliente : clientes) {
        if (cliente != null && cliente.getIdC().equals(idCliente)) {
            return true;
        }
    }
    return false;
}


    public Cliente buscarCliente(String idCliente) {
    for (Cliente cliente : clientes) {
        if (cliente.getIdC().equals(idCliente)) {
            return cliente;
        }
    }
    return null;
}

}
