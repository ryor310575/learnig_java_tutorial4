package com.cuatro.tutorial4_persona;
import java.util.*;
/* Esta clase hereda de la Clase Persona 
 * e Implemanta la Interfaz Comparable*/
public class Empleado extends Persona implements Comparable, Trabajadores{
	/*
	 * variables (Propiedades) de la Clase
	 */ 
	private double sueldo;
	private Date altaContrato;
	private String seccion;
	private int id;
	private static int nextId=1;
	
	/*
	 * Constructores
	 */
	public Empleado(String nom) {//Constructor con solo el nombre
		//Aca se colocan por defecto los parametros del otro 
		//constructor de la clase
		//public Empleado(String nom, double sue, int agno, int mes, 
		//int dia) 
		this(nom,30000,2000,1,15);
	}
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {//Constructor
		super(nom); //Toma el constructor de la clase Padre
		sueldo=sue;
		seccion = "Administración";
		GregorianCalendar contrato = new GregorianCalendar(agno,mes-1,dia);
		altaContrato=contrato.getTime(); //Crea el inicio del contrato
		id=nextId;
		nextId++;
	}
	
	/*
	 * Metodos GETTERS
	 */
	public static int dameDameNextId() {//getter
		return nextId;
	}
	public String dameSeccion() {//getter
		return seccion;
	}
	public double dameSueldo() {//getter
		return sueldo;
	}
	public Date dameFechaContrato() {//getter
		return altaContrato;
	}
	public int dameId() {//Getter
		return id;
	}
	public String dameDescripcion() { //Implementación desde la clase Persona 
	return "El empleado tiene un ID: "+id;	
	}
	
	/*
	 * Metodos SETTERS
	 */
	public double estableceBonus(double gratificacion) {
		double sueldoConBono=Trabajadores.bonusBase + gratificacion;
		return sueldoConBono;
	}
	public void subeSueldo(double porcentaje) {//Setter
		sueldo*=(1+porcentaje/100);
	}
	
	/*
	 * Otros Metodos
	 */
	public void cambiaSeccion(String seccion){//Setter
		this.seccion=seccion;
	}
	@Override
	public int compareTo(Object miObjeto) {//Implementación de la interfaz Comparable
		int compareResoult;
		Empleado otroEmpleado = (Empleado) miObjeto;// Casting de el objeto miObjeto a Empleado
		if(this.sueldo<otroEmpleado.sueldo) {
			compareResoult=-1;
		}else if(this.sueldo>otroEmpleado.sueldo) {
			compareResoult=1;
		}else {
			compareResoult=0;
		}
		
		return compareResoult;
	}
}
