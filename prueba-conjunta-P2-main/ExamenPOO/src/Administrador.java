/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
class Administrador extends Usuario {
    String usuario;
    String contrasenia;

    Administrador(String nombre, String apellido, String usuario, String contrasenia) {
        super(nombre, apellido, "Administrador");
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    // Método definido en el UML
    boolean login(String user, String pass) {
        if (this.usuario.equals(user) && this.contrasenia.equals(pass)) {
            return true;
        }
        return false;
    }

    // Método definido en el UML
    void gestionarCRUD() {
        // La ejecución real del CRUD ocurre desde las ventanas visuales,
        // este método representa la facultad exclusiva del administrador.
    }
}