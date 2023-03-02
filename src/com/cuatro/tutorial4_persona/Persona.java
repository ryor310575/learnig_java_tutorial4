package com.cuatro.tutorial4_persona;
/*
 * Clase abtracta, base para las demas clases
 */

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Persona {
	/*
	 * Propiedades de la clase
	 */
	private Date nacimientoDate;
	private final String nombre;
	public Persona(String nom) {
		nombre=nom;
		GregorianCalendar nacimiento=new GregorianCalendar();
		nacimientoDate=nacimiento.getTime();
	}
	/*
	 * Metodos setters
	 */
	void setNacimientoDate(int agno, int mes, int dia) {
		GregorianCalendar nacimiento=new GregorianCalendar(agno, mes-1, dia);
		this.nacimientoDate=nacimiento.getTime();
	}
	/*
	 * Metodos getters
	 */
	public String dameNombre() {//getter
		return nombre;
	}
	public Date dameNacimientoDate() {//getter
		return nacimientoDate;
	}
	/*
	 * Este es un metodo abstracto
	 */
	public abstract String dameDescripcion(); 

}
