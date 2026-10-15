/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_hashmap;

import java.util.HashMap;

/**
 *
 * @author Hplay
 */
public class clase_cajero {
    HashMap<Integer, Integer> cajero_automatico = new HashMap<>();
    public static final int[] denominaciones = {10000, 20000, 50000, 100000};
    public static final int cantidad_inicial = 100;

    public clase_cajero() {
        cajero_automatico.put(10000, cantidad_inicial);
        cajero_automatico.put(20000, cantidad_inicial);
        cajero_automatico.put(50000, cantidad_inicial);
        cajero_automatico.put(100000, cantidad_inicial);        
    }
    
    public int obtener_cantidad(int denominacion){
        if (!cajero_automatico.containsKey(denominacion)) {
            return -1;
        }
        return cajero_automatico.get(denominacion);
    }    
    
    public String validar_monto(int monto){
        if (monto < 10000 || monto > 1000000) {
            return "Error:  el monto debe estar entre 10.000 y 1.000.000";
        }
        else if (monto % 10 != 0) {
            return "Error: el monto debe ser multiplo de 10";
        }
        return "";
    }

    
}//fin de la clase
