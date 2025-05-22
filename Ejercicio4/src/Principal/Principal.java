package Principal;

import Entidades.Fruta;
import Implementacion.ImpFruta;

public class Principal {
	
	public static void main(String[] args) {
		
		//intanciar
		Fruta f1 = new Fruta("Mango", "Amarillo", 12, 1, "Verano");
		Fruta f2 = new Fruta("Melon", "cafe", 10, 1, "Verano");
		
		//aux
		Fruta fruta = null;
		ImpFruta impF = new ImpFruta();
		
		//guardar
		impF.guardar(f1.getNombre(), f1);
		impF.guardar(f2.getNombre(), f2);
		
		//mostarr
		impF.mostrar();
		
		//buscar
		//casteo: cambio de dato
		fruta = (Fruta) impF.buscar(f1.getNombre());
		System.out.println(fruta);
		
		//eliminar
		impF.eliminar(f2.getNombre());
		impF.mostrar();
		
		//contar
		impF.contar();
		
		//Van a realizar el uso de la clase Object con una lista Generica(no se usa HashMap)
		//Deben usar 3 entidades diferentes y cada entidad debera tener por lo menos 4 instancias 
		//todas deben llevar las pruebas(agregar, mostrar, editar, eliminar, y contar)
		
	}

}
