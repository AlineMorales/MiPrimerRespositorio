package com.mx.Coche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		//intancias de nuetro objeto: amnda a llamar ami clase, ya hregar el valor epsecifico 
		Coche coche1 = new Coche("Toyota", "Corolla", 2001, "rojo", 200000);
		Coche coche2 = new Coche("Chevrolet", "js", 2012, "Azul", 1000000000);
		Coche coche3 = new Coche("Nissan", "Versa", 2024, "_Rojo", 300000);
		Coche coche4 = new Coche("Toyota", "Tacoma", 2024, "blanco", 1700000);
		Coche coche5 = new Coche("Ford", "Fiesta", 2025, "Nego", 400000);
		Coche coche6 = new Coche("Ford", "Mustang", 2021, "Blanco", 250000);
		
		//objeto auxiliar: para poder asignarles un valor de busqueda
		//des declara nulo para depseues asinarle un valor que se requiera
		Coche auxCoche=null;
		
		//creacion de una lista 
		//es una estruitura de datos que permite alamcenar elementos de manera ordenada 
		//Se usa la interfaz List que poreviene de java.util
		
		List<Coche> lista = new ArrayList<Coche>();
		
		//guardar objetos en la lista
		lista.add(coche1);
		lista.add(coche2);
		lista.add(coche3);
		lista.add(coche4);
		lista.add(coche5);
		lista.add(coche6);
		/*
		//Mostrar los datos en la lista
		System.out.println("Elementos en la lista\n" + lista);
		
		//metodo para buscar un elemento en la lista 
		auxCoche = lista.get(1);
		System.out.println("Elemento encontrado: " + auxCoche);
		
		//metodo para editar
		auxCoche = lista.get(0);
		auxCoche.setColor("AZUL DIAMANTE");
		auxCoche.setPrecio(250000);
		System.out.println("Elemento editado " +  auxCoche);
		
		
		//eliminar
		lista.remove(5);
		System.out.println("Lista actualizada:\n" + lista);
		
		//contar elementos en la lista 
		System.out.println("Existen : " + lista.size() + " coches en la lista");
		
		//eliminar todo 
		lista.clear();
		
		//va;idar si la lista esta vacia 
		if(lista.isEmpty()) {
			System.out.println("La lista esta vacia.");
		}else {
			System.out.println("La lista es: " +  lista);
		}
		
		*/
		
		//creacion de un menu interactivo para manipular lainformacion de nuestra lista 
		
		Scanner scan = null;//se utiliza para leer la entrada de un usuario
		int menuPrincipal = 0, menuSecundario = 0, indice =0;
		//los menus son variables que van a lamcnar opciones 
		//indice va a almacenar el indice de un objeto.
		
		//variables locales 
		String marca, subMarca, color;
		int modelo;
		double precio;
		
		//inicio de mi menu interactuivo 
		//uso del ciclo do-while: en java es una estructura que permite ejecutar un bloque de codigo 
		//al menos una vez y continua su ejecucion hasta cunmplir la condicion
		
		do {
			System.out.println("-----MENU-----");
			System.out.println("1.- Agregar un nuevo registro");
			System.out.println("2.- Mostrar la lista");
			System.out.println("3.- Editar");
			System.out.println("4.- Buscar un elemento");
			System.out.println("5.- Eliminar elementos");
			System.out.println("6.- Contar todos los elementos");
			System.out.println("7.- Salir del menu");
			System.out.println("*******Elige una opcion en el menu********");
			scan = new Scanner(System.in);
			menuPrincipal = scan.nextInt();
			
			//metodo switch o metodo case: es una estructura de control de flujo que permite ejecutar 
			//deferentes bloque sde codigos basados en el valor de una expresion
			//tambien es concido como meodo case porque dentro de un Switch se tulizan varias declaraciones
			//case para manejar los diferentes casos de una posible expresion
			
			switch(menuPrincipal) {
			case 1:
				System.out.println("1.- Agregar un nuevo resgistro");
				System.out.println("Escribe la marca del coche");
				scan = new Scanner(System.in);
				marca = scan.nextLine();
				
				System.out.println("Escribe la subMarca del coche");
				scan =  new Scanner(System.in);
				subMarca = scan.nextLine();
				
				System.out.println("Escribe el modelo del coche");
				scan = new Scanner(System.in);
				modelo = scan.nextInt();
				
				System.out.println("Escribe el color del coche");
				scan= new Scanner(System.in);
				color = scan.nextLine();
				
				System.out.println("Escribe el precio del coche");
				scan = new Scanner(System.in);
				precio = scan.nextDouble();
				
				auxCoche =  new Coche(marca, subMarca, modelo, color, precio);
				
				//guadrar
				lista.add(auxCoche);
				System.out.println("El registro fue exitoso!");
				break;//rompe el primear CASE
			case 2:
				System.out.println("2.- mostrar la lista");
				System.out.println("La infromacion almacenada es:\n" + lista);
				break;
			case 3:
				System.out.println("3.- Editando un elemento");
				System.out.println("Ingresa el indice para editar");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				
				auxCoche = lista.get(indice);
				
				do {
					System.out.println("1.- Editar marca");
					System.out.println("2.- Editar subMarca");
					System.out.println("3.- Editar modelo");
					System.out.println("4.- Editar color");
					System.out.println("5.- Editar Precio");
					System.out.println("6.- Regresar al menu Principal");
					System.out.println("***Elige una opcion valida***");
					
					scan =  new Scanner(System.in);
					
					menuSecundario = scan.nextInt();
					
					switch(menuSecundario) {
					case 1:
						System.out.println("Escribe la nueva marca:");
						scan = new Scanner(System.in);
						marca =scan.nextLine();
						auxCoche.setMarca(marca);
						lista.set(indice, auxCoche);
						System.out.println("Se edito correctamente");
						break;
					case 2: 
						System.out.println("Escribe la nueva subMarca");
						scan = new Scanner(System.in);
						subMarca = scan.nextLine();
						auxCoche.setSubMarcar(subMarca);
						lista.set(indice, auxCoche);
						System.out.println("Se edito corrrectamente");
						break;
					case 3 : 
						System.out.println("Escribe el modelo del coche");
						scan = new Scanner(System.in);
						modelo = scan.nextInt();
						auxCoche.setModelo(modelo);
						lista.set(indice, auxCoche);
						System.out.println(" se edito correctamnte");
						break;
					case 4:
						System.out.println("Escribe color del coche");
						scan =  new Scanner(System.in);
						color = scan.nextLine();
						auxCoche.setColor(color);
						lista.set(indice, auxCoche);
						break;
					case 5: 
						System.out.println("Escribe el precio");
						scan = new Scanner(System.in);
						precio = scan.nextDouble();
						auxCoche.setPrecio(precio);
						lista.set(indice, auxCoche);
						System.out.println("Se edito correctamente");
						break;
					case 6:
						System.out.println("Regresando al menu PRincipal...Regresa pronto!");
						break;
						default:
							System.out.println("indice fuera de rango intenmta otra vez");
							break;	
					}
				}while(menuSecundario != 6);
				break;
			case 4:
				System.out.println("4.- Buscar un elemento");
				System.out.println("Cual es el indice que bsuca?");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				auxCoche = lista.get(indice);
				System.out.println("Elemento Encontrado: "  + auxCoche);
				break;
			case 5:
				System.out.println("5.- Eliminando elementos");
				System.out.println("que desea eliminar?");
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				lista.remove(indice);
				System.out.println("Se elimino correctamente. \nLista actualizada\n " + lista);
				break;
			case 6:
				System.out.println("6.- Contando los elemntos en la lista");
				System.out.println("Existen: " + lista.size() + " coches en la lista");
				break;
			case 7:
				System.out.println("Saliendo del menu, vuelve pronto!!");
				break;
				default:
					System.out.println("Opcion invalidad... INtenta con uno dentro del menu!");
					break;
			}
			
		}while(menuPrincipal != 7);
		
		
		//Realizar el menu intercativo para la practica que realizaron ustedes 
		/*
		 * con las igueintes opciones 
		 * 
		 * 1.- Agregar registro
		 * 2.- Mostrar losta
		 * 2.- Editar
		 * 4.- Buscar un elemento por atributo
		 * 5.- Eliminar un elemento por atributo
		 * 6.- contar elementos
		 * 7. eliminar todo
		 * 8.- salir
		 * 
		 * agregar validaciones, por ejemplo en ingresar un nuevo elemento, debe de comprar antes
		 *para que no existan elementos duplicados 
		 *y al eliminar y editar debe buscar y validar que el elemneto existe 
		 */
		
	}//aqui termina metodo main
	
	//Realizar como actividad de practica, la replicacion del ejerecico, 
	//van a crear un nuevo 
	//proyecto java, con su pauqeem y sus clases para una nueva entidad
	//van a relizar todas la pruebas de la lista agregando por 
	//los menos 5 intancias .
	
	//Extra
	
	/* ordenar por marca(alfabeticamente)
	 * 
	 * ordenar por precio de menor a mayor
	 * 
	 * */
	
	

}
