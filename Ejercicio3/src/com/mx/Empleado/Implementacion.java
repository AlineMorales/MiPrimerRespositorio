package com.mx.Empleado;

import java.util.HashMap;

public class Implementacion implements IMetodos {
	
	/*
	 * sintaxis del HashMap
	 * HashMap<Clave, Valor> hash = new HashMap<Clave, Valor>();
	 * 
	 * HashMap -> es una libreria de java.util
	 * KeyDataType -> clase contenedora del dato primitivo de la clave
	 * ValueDataType -> el nombre de la clase
	 * nombre -> asignado por el programador
	 * new -> palabra reservada para invocar al constructor y lo llama por defecto 
	 */
	
	//declaracion del HashMap
	HashMap<Integer, Empleado> hash = new HashMap<Integer, Empleado>();

	@Override
	public void guardar(Empleado empleado) {
		
		hash.put(empleado.getClave(), empleado);
	}

	@Override
	public Empleado buscar(Empleado empleado) {
		
		return hash.get(empleado.getClave());
	}

	@Override
	public void editar(Empleado empleado) {
		hash.replace(empleado.getClave(), empleado);
		
	}

	@Override
	public void eliminar(Empleado empleado) {
		hash.remove(empleado.getClave());
		
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}
	
	//metodo personalizado contar
	public void contar() {
		System.out.println("El hashMap contiene: " + hash.size() + " empleados");
	}
	
	//metodo para evitar duplicados en clave 
	public boolean existeClave(int clave) {
		return hash.containsKey(clave);
	}

}
