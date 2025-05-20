package com.mx.Celular;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos {

	// declaracion de una lista
	List<Celular> lista = new ArrayList<Celular>();

	@Override
	public void guardar(Celular celular) {
		lista.add(celular);

	}

	@Override
	public void editar(int indice, Celular celular) {
		lista.set(indice, celular);

	}

	@Override
	public void mostrar() {
		System.out.println(lista);

	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);

	}

	@Override
	public Celular buscar(int indice) {

		return lista.get(indice);
	}

	// metodo personalizado
	public void contar() {
		int cont = lista.size();
		System.out.println("La lista contiene: " + cont + " celulares.");
	}

	// metodo de xistencia de duplicados
	public boolean existeDuplicado(Celular nuevo) {
		for (Celular c : lista) {
			if (c.getMarca().equalsIgnoreCase(nuevo.getMarca()) && c.getModelo().equalsIgnoreCase(nuevo.getModelo())
					&& c.getRam() == nuevo.getRam() && c.getColor().equalsIgnoreCase(nuevo.getColor())
					&& c.getAlmacenamiento() == nuevo.getAlmacenamiento() && c.getPrecio() == nuevo.getPrecio()) {
				return true; // ya existe un celular igual
			}
		}
		return false;
	}

}
