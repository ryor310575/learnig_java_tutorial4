package com.cuatro.tutorial4_persona;

import java.util.Arrays;

public class usoEmpleado {

	public static void main(String[] args) {
		
		Empleado[] empleado=new Empleado[5];
		Jefatura jefe_rrhh= new Jefatura("Juan Gonzalez",55000,2006,9,25);
		Alumno pasante=new Alumno("Pedro Gomez","Biologia");
		jefe_rrhh.estableceIncentivo(2570);
		 empleado[0]=new Empleado("Jose Gomez",1500,1980,06,24);
		 empleado[1]=new Empleado("Alva Perez",1600,1995,8,15);
		 empleado[2]=new Empleado("Mirta Casas",1250,2001,12,22);
		 /*
		  * el objeto Jefe del tipo Jefaturaes parte de un arreglo de tipo 
		  * Empleado. Ademas se puede crear un nuevo objeto de Jefatura.
		  */
		 empleado[3]=jefe_rrhh; //Uso del Polimorfismo
		 empleado[4]=new Jefatura("Maria Perez",95000,1999,5,26);//Uso del Polimorfismo
		 
		 Jefatura jefa_finanzas=(Jefatura)empleado[4];//Casting
		 jefa_finanzas.estableceIncentivo(02570);	
		 Jefatura director_comercial=new Jefatura("Sandra Gomez",85000,2012,05,06);
		 System.out.println(director_comercial.tomarDesiciones("Vacaciones"));	
		 System.out.println("Jefa "+director_comercial.dameNombre()+" tieine un bono de  "+director_comercial.estableceBonus(3000));
		 System.out.println("Empleado "+empleado[2].dameNombre()+" tieine un bono de  "+empleado[2].estableceBonus(3000));
		 Arrays.sort(empleado); //Ordena el array de objetos del tipo empleado 
		 /*
		  * Imprimir el nombre de los empleados
		  */
		 for (Empleado e: empleado) {
				System.out.println("El Nombre: "+e.dameNombre()+" ID: "+e.dameId()+" el sueldo es "+e.dameSueldo());	
				 }
		 /*
		  * Subir sueldo 
		  */
		 for (Empleado e: empleado) {
				e.subeSueldo(10);	
				 } 
		 
		/*
		 * Imprimir el nombre de los empleados
		 */
		 for (Empleado e: empleado) {
				System.out.println("El Nombre: "+e.dameNombre()+" el sueldo con aumento es es "+e.dameSueldo());	
				 }
		 /*
		  * Imprimir los casos especiales para ver la herencia
		  * Probando el uso de la clase ABSTRACTA Persona 
		  * el metodo dameDescripcion
		  * implementada en Empleado y heredada por jefatura e implementada
		  * de forma diferente en la clase alumno.
		  */
		 System.out.println("Nombre: "+jefe_rrhh.dameNombre()+" "+jefe_rrhh.dameDescripcion());
		 System.out.println("Nombre: "+pasante.dameNombre()+" "+pasante.dameDescripcion());
		 System.out.println(jefe_rrhh.tomarDesiciones("Dar mas dias de vacaciones"));
	}

}