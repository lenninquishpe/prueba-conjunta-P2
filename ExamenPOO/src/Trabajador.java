/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
class Trabajador extends Usuario {
    String zonaAsignada;
    int idTrabajador; 

    Trabajador(int idTrabajador, String nombre, String apellido, String zonaAsignada) {
        super(nombre, apellido, "Trabajador");
        this.idTrabajador = idTrabajador;
        this.zonaAsignada = zonaAsignada;
    }
}
