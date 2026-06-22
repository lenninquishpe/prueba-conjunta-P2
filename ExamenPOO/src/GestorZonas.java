/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.HashMap;
import java.util.ArrayList;

class GestorZonas {
    // Atributo definido en el UML
    HashMap<String, ArrayList<Trabajador>> mapaZonas;

    GestorZonas() {
        mapaZonas = new HashMap<>();
        // Inicializamos las 4 zonas de fabricación
        mapaZonas.put("Recepción", new ArrayList<Trabajador>());
        mapaZonas.put("Clasificación y almacenaje", new ArrayList<Trabajador>());
        mapaZonas.put("Despiece y eviscere", new ArrayList<Trabajador>());
        mapaZonas.put("Cocción al vapor", new ArrayList<Trabajador>());
    }

    // Métodos definidos en el UML

    boolean crearTrabajador(String zona, Trabajador t) {
        if (mapaZonas.containsKey(zona)) {
            mapaZonas.get(zona).add(t);
            return true;
        }
        return false;
    }

    ArrayList<Trabajador> leerTrabajadores(String zona) {
        if (mapaZonas.containsKey(zona)) {
            return mapaZonas.get(zona);
        }
        return new ArrayList<Trabajador>(); 
    }

    boolean actualizarTrabajador(String zona, Trabajador t) {
        if (mapaZonas.containsKey(zona)) {
            ArrayList<Trabajador> lista = mapaZonas.get(zona);
            for (Trabajador actual : lista) {
                // Buscamos por ID y actualizamos los datos
                if (actual.idTrabajador == t.idTrabajador) {
                    actual.nombre = t.nombre;
                    actual.apellido = t.apellido;
                    actual.zonaAsignada = t.zonaAsignada;
                    return true; 
                }
            }
        }
        return false; 
    }

    boolean eliminarTrabajador(String zona, int idTrabajador) {
        if (mapaZonas.containsKey(zona)) {
            ArrayList<Trabajador> lista = mapaZonas.get(zona);
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).idTrabajador == idTrabajador) {
                    lista.remove(i); // Lo quitamos del ArrayList
                    return true; 
                }
            }
        }
        return false;
    }
}