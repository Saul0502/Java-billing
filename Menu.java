package proyectoact;

import javax.swing.JOptionPane;

public class Menu {

private CatalogoProveedor catalogoProveedor = new CatalogoProveedor();
private CatalogoServicios catalogoServicios = new CatalogoServicios(catalogoProveedor);
private CatalogoPaqueteEspeciales catalogoPaquetes = new CatalogoPaqueteEspeciales(catalogoServicios, catalogoProveedor);
private CatalogoClientes catalogoClientes = new CatalogoClientes();
private generarReserva reserva = new generarReserva(catalogoServicios,catalogoClientes);
private Facturacion facturacion = new Facturacion(catalogoClientes,catalogoServicios);
private RegistroUsuarios registroUsuarios = new RegistroUsuarios();
private Caja caja = new Caja(catalogoServicios);

    public void mostrarMenu() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú Principal:\n\n" +
                "1. Usuarios\n" +
                "2. Proveedores\n" +
                "3. Servicios\n" +
                "4. Clientes\n" +
                "5. Paquetes Especiales\n" +
                "6. Reservas\n" +
                "7. Factura\n" +
                "8. Caja\n" +
                "9. Salir\n\n" +
                "Seleccione una sección:"));

            switch (opcion) {
                case 1:
                    menuUsuarios();
                    break;
                case 2:
                    menuProveedores();
                    break;
                case 3:
                    menuServicios();
                    break;
                case 4:
                    menuClientes();
                    break;
                case 5:
                    menuPaquetesEspeciales();
                    break;
                case 6:
                    menuReservas();
                    break;
                case 7:
                    facturacion.agregarFact();
                    break;
                case 8:
                    caja.mostrarIngresosDelDia();
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 9);
    }

    private void menuServicios() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "--- Servicios ---\n\n" +
                "1. Agregar Servicio\n" +
                "2. Consultar Servicios\n" +
                "3. Buscar Servicio\n" +
                "4. Modificar Servicio\n" +
                "5. Cambiar Estado del Servicio\n" +
                "6. Volver al Menú Principal\n\n" +
                "Seleccione una opción:"));
            
            switch (opcion) {
                case 1:
                    catalogoServicios.llenarDatos();
                    break;
                case 2:
                    catalogoServicios.mostrarElementos();
                    break;
                case 3:
                    catalogoServicios.buscarServicio();
                    break;
                case 4:
                    catalogoServicios.modificarServicio();
                    break;
                case 5:
                    catalogoServicios.modificarEstado();
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 6);
    }

    private void menuPaquetesEspeciales() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "--- Paquetes Especiales ---\n\n" +
                "1. Agregar Paquete Especial\n" +
                "2. Consultar Paquetes Especiales\n" +
                "3. Editar Paquete Especial\n" +
                "4. Volver al Menú Principal\n\n" +
                "Seleccione una opción:"));
            
            switch (opcion) {
                case 1:
                    catalogoPaquetes.agregarPaquete();
                    break;
                case 2:
                    catalogoPaquetes.mostrarPaquetes();
                    break;
                case 3:
                    catalogoPaquetes.editarPaquete();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 4);
    }

    private void menuReservas() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "--- Reservas ---\n\n" +
                "1. Añadir Reserva\n" +
                "2. Modificar Reserva\n" +
                "3. Cancelar Reserva\n" +
                "4. Volver al Menú Principal\n\n" +
                "Seleccione una opción:"));
            
            switch (opcion) {
                case 1:
                    reserva.añadirReserva();
                    break;
                case 2:
                    reserva.modificarReserva();
                    break;
                case 3:
                    reserva.cancelarReserva();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 4);
    }

    private void menuUsuarios() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "--- Usuarios ---\n\n" +
                "1. Registrar Usuario\n" +
                "2. Mostrar Usuarios\n" +
                "3. Buscar Usuario\n" +
                "4. Modificar Usuario\n" +
                "5. Cambiar Estado del Usuario\n" +
                "6. Volver al Menú Principal\n\n" +
                "Seleccione una opción:"));
            
            switch (opcion) {
                case 1:
                    registroUsuarios.llenarDatos();
                    break;
                case 2:
                    registroUsuarios.mostrarElementos();
                    break;
                case 3:
                    registroUsuarios.buscarUsuario();
                    break;
                case 4:
                    registroUsuarios.modificarUsuario();
                    break;
                case 5:
                    registroUsuarios.modificarEstado();
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 6);
    }

    private void menuProveedores() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "--- Proveedores ---\n\n" +
                "1. Agregar Proveedor\n" +
                "2. Mostrar Proveedores\n" +
                "3. Buscar Proveedor\n" +
                "4. Editar Proveedor\n" +
                "5. Cambiar Estado del Proveedor\n" +
                "6. Volver al Menú Principal\n\n" +
                "Seleccione una opción:"));
            
            switch (opcion) {
                case 1:
                    catalogoProveedor.agregarProveedor();
                    break;
                case 2:
                    catalogoProveedor.mostrarProveedores();
                    break;
                case 3:
                    catalogoProveedor.buscarProveedor();
                    break;
                case 4:
                    catalogoProveedor.editarProveedor();
                    break;
                case 5:
                    catalogoProveedor.cambiarEstadoProveedor();
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 6);
    }

    private void menuClientes() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "--- Clientes ---\n\n" +
                "1. Agregar Cliente\n" +
                "2. Mostrar Clientes\n" +
                "3. Buscar Cliente\n" +
                "4. Editar Cliente\n" +
                "5. Cambiar Estado del Cliente\n" +
                "6. Volver al Menú Principal\n\n" +
                "Seleccione una opción:"));
            
            switch (opcion) {
                case 1:
                    catalogoClientes.agregarCliente();
                    break;
                case 2:
                    catalogoClientes.mostrarClientes();
                    break;
                case 3:
                    catalogoClientes.buscarCliente();
                    break;
                case 4:
                    catalogoClientes.editarCliente();
                    break;
                case 5:
                    catalogoClientes.modificarEstado();
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 6);
    }
}

