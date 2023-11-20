/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busqarreglo;

import java.util.Objects;

/**
 *
 * @author Nadier
 */
public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String dni, String nombres, String direccion,String carrera) {
        super(dni, nombres, direccion);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante estudiante = (Estudiante) obj;
        return Objects.equals(getDni(), estudiante.getDni());
    }
}
