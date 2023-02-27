package com.cuatro.tutorial4_persona;

public class Jefatura extends Empleado implements Jefes{
	private double incentivo;
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	public Jefatura(String nom) {
		super(nom);	
	}
	public void estableceIncentivo(double incentivo) {
		this.incentivo=incentivo;
	}
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe+incentivo;
	}
	public String tomarDesiciones(String desición) {
		return "Resultado de la desición sobre " + desición;
	}
	public double estableceBonus(double gratificacion) {
		double prima=2000;
		double sueldoConBono=Trabajadores.bonusBase + gratificacion +prima;
		return sueldoConBono;
	};

}
