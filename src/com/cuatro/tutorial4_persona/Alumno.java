package com.cuatro.tutorial4_persona;

import java.lang.reflect.Constructor;

public class Alumno extends Persona {
	private String carrera;
	public Alumno(String nom, String carrera) {
	/*
	 *Se debe llamar al Constructor 
	 *de la clase Padre 
	 */
		super(nom);  
	this.carrera=carrera;
	}
	/*
	 * Metodos getters
	 */
	public String getCarrera() {
		return carrera;
	}

	/*
	 * Implementación del metodo dameDescripcion 
	 * de la clase persona
	 */
	public String dameDescripcion() {
	return "El Alumno estudia: "+carrera;	
	}
	
	/*
	 * Metodos Setters
	 */ 
	public void setCarrera(String carrera) {
		this.carrera=carrera;
	}
}