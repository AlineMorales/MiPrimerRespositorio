package Principal;
//Clase Object: es la clase raiuz de todas las clases
//si se usa para un HashMap o en una lista(Ejemplo HashMap<Object, Object> estamos diciendo que tanto
//la clave como el valor pueden ser de cualquier tipo de dato o valor 
public interface IMetodos {
	
	void guardar(Object key, Object value);
	void editar(Object key, Object value);
	void eliminar(Object key);
	Object buscar(Object key);
	void mostrar();

}
