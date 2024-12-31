package proyectoact;

import javax.swing.JOptionPane;

public class RegistroUsuarios {

    private int x; 
    private Usuario usuarios[] = new Usuario[100]; 

    public void llenarDatos() {
    for (x = 0; x < usuarios.length; x++) {
        if (usuarios[x] == null) { 
            Usuario user = new Usuario();

            user.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del usuario:"));
            user.setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos del usuario:"));

            String nickname;
            boolean nicknameExistente;
            do {
                nickname = JOptionPane.showInputDialog("Ingrese el nickname del usuario:");
                nicknameExistente = verificarNicknameExistente(nickname);

                if (nicknameExistente) {
                    JOptionPane.showMessageDialog(null, "El nickname ya existe, ingrese otro");
                }
            } while (nicknameExistente); 

            user.setNickname(nickname);
            user.setPassword(JOptionPane.showInputDialog("Ingrese la contraseña del usuario:"));
            user.setEstado(true); 

            usuarios[x] = user; 
            JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente.");
            return; 
        }
    }
    JOptionPane.showMessageDialog(null, "No hay espacio");
}

    public void mostrarElementos() {
        String s = "";
        for (x = 0; x < usuarios.length; x++) {
            if (usuarios[x] != null) {
                s += "Nombre: " + usuarios[x].getNombre()
                        + "\nApellidos: " + usuarios[x].getApellidos()
                        + "\nNickname: " + usuarios[x].getNickname()
                        + "\nEstado: " + (usuarios[x].isEstado() ? "Activo" : "Inactivo") + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Lista de Usuarios:\n" + s);
    }

    public void buscarUsuario() {
        String nicknameBuscar = JOptionPane.showInputDialog("Ingrese el nickname del usuario que desea buscar:");
        for (x = 0; x < usuarios.length; x++) {
            if (usuarios[x] != null && usuarios[x].getNickname().equals(nicknameBuscar)) {
                JOptionPane.showMessageDialog(null,
                        "Información del Usuario:\n"
                        + "Nombre: " + usuarios[x].getNombre()
                        + "\nApellidos: " + usuarios[x].getApellidos()
                        + "\nNickname: " + usuarios[x].getNickname()
                        + "\nEstado: " + (usuarios[x].isEstado() ? "Activo" : "Inactivo"));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
    }

    public void modificarUsuario() {
        String nicknameBuscar = JOptionPane.showInputDialog("Ingrese el nickname del usuario que desea modificar:");
        for (x = 0; x < usuarios.length; x++) {
            if (usuarios[x] != null && usuarios[x].getNickname().equals(nicknameBuscar)) {
                usuarios[x].setNombre(JOptionPane.showInputDialog("Nuevo nombre:", usuarios[x].getNombre()));
                usuarios[x].setApellidos(JOptionPane.showInputDialog("Nuevos apellidos:", usuarios[x].getApellidos()));
                usuarios[x].setPassword(JOptionPane.showInputDialog("Nueva contraseña:"));
                JOptionPane.showMessageDialog(null, "Usuario modificado");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
    }

    public void modificarEstado() {
        String nicknameBuscar = JOptionPane.showInputDialog("Ingrese el nickname del usuario al que desea cambiar el estado:");
        for (x = 0; x < usuarios.length; x++) {
            if (usuarios[x] != null && usuarios[x].getNickname().equals(nicknameBuscar)) {
                usuarios[x].setEstado(!usuarios[x].isEstado()); // Alterna el estado
                String estado = usuarios[x].isEstado() ? "activado" : "desactivado";
                JOptionPane.showMessageDialog(null, "Usuario " + estado + " correctamente");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
    }

    public boolean existeUsuario(String nickname) {
        for (x = 0; x < usuarios.length; x++) {
            if (usuarios[x] != null && usuarios[x].getNickname().equals(nickname)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean verificarNicknameExistente(String nickname) {
    for (int i = 0; i < usuarios.length; i++) {
        if (usuarios[i] != null && usuarios[i].getNickname().equals(nickname)) {
            return true; 
        }
    }
    return false; 
}
}
