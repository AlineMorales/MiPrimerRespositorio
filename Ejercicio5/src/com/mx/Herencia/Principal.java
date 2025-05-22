package com.mx.Herencia;

public class Principal {
	
	public static void main (String[] args) {
		
		//instanciar hijo
		Hijo hijo1 = new Hijo("Saul", "Gomez", 12, 1.60, "mexicana", "cafe", "delgado");
		
		System.out.println(hijo1);
		
		hijo1.setEdad(21);
		hijo1.setNombre("Fernando");
		System.out.println(hijo1);
		
		
		hijo1.trabajar();
	}

}
