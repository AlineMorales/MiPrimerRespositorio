package Implementacion;

import java.util.HashMap;

import Principal.IMetodos;

public class ImplementacionGenerica  implements IMetodos{
	
	//delcracion de HashMap
	protected HashMap<Object, Object> hash = new HashMap<Object, Object>();

	@Override
	public void guardar(Object key, Object value) {
		hash.put(key, value);
		
	}

	@Override
	public void editar(Object key, Object value) {
		hash.replace(key, value);
		
	}

	@Override
	public void eliminar(Object key) {
		hash.remove(key);
	}

	@Override
	public Object buscar(Object key) {
		
		return hash.get(key);
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
	}

}
