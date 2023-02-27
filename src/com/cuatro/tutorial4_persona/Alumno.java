package com.cuatro.tutorial4_persona;

public class Alumno extends Persona {
	private String carrera;
	public Alumno(String nom, String carrera) {
	super(nom);
	this.carrera=carrera;
	}
	public String dameDescripcion() {//Implementación de la clase persona
	return "El Alumno estudia: "+carrera;	
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera=carrera;
	}

}
