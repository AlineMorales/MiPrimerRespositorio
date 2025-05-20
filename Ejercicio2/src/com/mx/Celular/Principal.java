package com.mx.Celular;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		//intanciar el objeto 
		Celular celular1 = new Celular("Samsung", "s23 fe", 8, "negro", 125, 8000);
		Celular celular2 = new Celular("Motorola", "Edge 30 ", 16, "verde", 256, 9000);
		Celular celular3 = new Celular("Xiaomi", "Note 15", 24, "negro", 512, 12000);
		Celular celular4 = new Celular("Apple", "Iphone 14", 6, "negro", 128, 14000);
		Celular celular5 = new Celular("apple", "16 pro", 9, "negro", 128, 15000);
		
		//objeto auxiliar
		Celular cel = null;
		
		//mandar a llmar a mi clase implemmentacion para poder ocupar sus metodos 
		Implementacion imp = new Implementacion();
		
		//guardar
		imp.guardar(celular1);
		imp.guardar(celular2);
		imp.guardar(celular3);
		imp.guardar(celular4);
		imp.guardar(celular5);
	/*	
		//mostrar
		imp.mostrar();
		
		//buscar
		cel = imp.buscar(0);
		System.out.println("Elemento encontrado: " + cel);
		
		//editar
		cel = imp.buscar(1);
		cel.setModelo("MotoG 60");
		cel.setPrecio(2400);
		imp.editar(1, celular2);
		imp.mostrar();
		
		//eliminar
		imp.eliminar(3);
		imp.mostrar();
		
		//contar
		imp.contar();
		
		//relicar el ejercicio con una entidad diferente
		*/
		
		//MENU INTERACTIVO
		
		//DECLRACION DE VARIABLES 
		Scanner datos = new Scanner(System.in);
		int menuP = 0, menuS=0, indice =0;
		
		String marca, modelo,color;
		int ram, almacenamiento;
		double  precio;
		
		do {
			System.out.println("*****MENU******");
			System.out.println("1.- ALTA");
			System.out.println("2.- BUSCAR");
			System.out.println("3.- EDITAR");
			System.out.println("4.- ELIMINAR");
			System.out.println("5.- MOSTRAR");
			System.out.println("6.- CONTAR");
			System.out.println("7.- SALIR");
			System.out.println("---Elige una opcion valida en el menu---");
			
			//Declaracion del bloque tryCatch para evitar que le programa se detenga cuando
			//el usuario introduzca valores no numericos
			try {
				menuP = datos.nextInt();
				datos.nextLine();
				
				//inicia mi bloque case
				switch(menuP) {
				case 1:
					System.out.println("<<<<<<<<A L T A>>>>>>>>");
					System.out.println("Llena los siguientes datos sobre el celular");
					
					System.out.println("Marca: ");
					marca =datos.nextLine();
					
					System.out.println("Modelo: ");
					modelo = datos.nextLine();
					
					System.out.println("Ram: ");
					ram = datos.nextInt();
					datos.nextLine();
					
					System.out.println("Color:");
					color = datos.nextLine();
					
					System.out.println("Almacenamiento: ");
					almacenamiento = datos.nextInt();
					datos.nextLine();
					
					System.out.println("Precio: ");
					precio = datos.nextDouble();
					datos.nextLine();
					
					cel = new Celular(marca, modelo, ram, color, almacenamiento, precio);
					
					if(imp.existeDuplicado(cel)) {
						System.out.println("Este registro ya existe en la lista, No se puede agregar duplicados");
					}else {
						imp.guardar(cel);
						System.out.println("Se guardo con existo el celuar: " + cel.getMarca() + " en la lista.");
					} 
					break;
				case 2:
					System.out.println("<<<<<<<<B U S C A R>>>>>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0) {
						System.out.println("Indica el indice para mostrar la informacion");
						indice = datos.nextInt();
						datos.nextLine();
						
						if(indice >= 0 && indice < imp.lista.size()) {
							cel = imp.buscar(indice);
							System.out.println("Esta es la informacion completa del celular: " + cel);
						}else {
							System.out.println("indice fuera de rango, intenta con uno dentro del menu.");
						}
					}
					break;
				case 3:
					System.out.println("<<<<<<<<E D I T A R>>>>>>>>");
					imprimirDatos(imp);
					if (imp.lista.size() > 0) {
						System.out.println("Indique el indice que desea editar");
						indice = datos.nextInt();
						datos.nextLine();
						
						if(indice >= 0 && indice < imp.lista.size()) {
							do {
								System.out.println("******MENU EDITAR*****");
								System.out.println("1.- EDITAR MARCA");
								System.out.println("2.- EDITAR MODELO");
								System.out.println("3.- EDITAR RAM");
								System.out.println("4.- EDITAR COLOR");
								System.out.println("5.- EDITAR ALMACENAMIENTO");
								System.out.println("6.- EDITAR PRECIO");
								System.out.println("7.- REGRESAR AL MENU PRINCIPAL");
								System.out.println("**ELIGE UNA OPCION VALIDA**");
								
								menuS = datos.nextInt();
								datos.nextLine();
								cel = imp.buscar(indice);
								
								switch(menuS) {
								case 1: 
									System.out.println("Ingresa la nueva marca");
									marca= datos.nextLine();
									cel.setMarca(marca);
									break;
								case 2:
									System.out.println("Ingresa el nuevo modelo");
									modelo = datos.nextLine();
									cel.setModelo(modelo);
									break;
								case 3:
									System.out.println("Ingresa la nueva ram");
									ram = datos.nextInt();
									cel.setRam(ram);
									break;
								case 4:
									System.out.println("Ingresa el nuevo color");
									color = datos.nextLine();
									cel.setColor(color);
									break;
								case 5: 
									System.out.println("Ingresa el nuevo almacenamiento:");
									almacenamiento = datos.nextInt();
									cel.setAlmacenamiento(almacenamiento);
									break;
								case 6:
									System.out.println("Ingresa el nuevo precio:");
									precio = datos.nextDouble();
									cel.setPrecio(precio);
									break;
								case 7:
									System.out.println("Regresando al menu Principal!!!");
									break;
									default: 
										System.out.println("Indice no valido");
										break;
								}
								System.out.println("edicion Exitosa");
							}while(menuS != 7);
						}else {
							System.out.println("Indice fuera de rango intente con uno dentro del menu");
						}
					}
					break;
				case 4:
					System.out.println("<<<<<<<<E L I M I N A R>>>>>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0 ) {
						System.out.println("indica el indice que dease eliminar");
						indice = datos.nextInt();
						if(indice >= 0 && indice <imp.lista.size()) {
							imp.eliminar(indice);
							System.out.println("Eliminacion existosa");
						}else {
							System.out.println("indice fuera de rango");
						}
					}
					break;
				case 5:
					System.out.println("<<<<<<<<M O S T R A R>>>>>>>>");
					if(imp.lista.size() >0 ) {
						imp.mostrar();
					}else {
						System.out.println("No hay registros disponibles");
					}
					break;
				case 6:
					System.out.println("<<<<<<<<C O N T A R>>>>>>>>");
					imp.contar();
					break;
				case 7:
					System.out.println("Saliendo del menu... veuelve pronto!");
					break;
					default:
						System.out.println("indice fuera de rango, intenta con uno dentro del menu");
						break;	
				}//fin de switch
			}catch (InputMismatchException e) {
				System.out.println("Entrada invalidad, por favor ingrese un numero");
				datos.nextLine();
			}catch (Exception e) {
				System.out.println("Ocurrio un error inesperado" + e.getMessage());
			}
		}while(menuP != 7);
		
	
		
	}//AQUI TERMINA MAIN
	
	//METODO ESTATICO PARA IMPIRMIR UN MENU DE OPCIONES PARA EL USUARIO
	public static void imprimirDatos(Implementacion imp) {
		System.out.println("-----Celulares Registrados-----");
		if(imp.lista.size() >0) {
			for(int i = 0; i < imp.lista.size(); i++) {
				System.out.println("El celular [" + i + "] de marca: " + imp.lista.get(i).getMarca()); 
			}
		}else {
			System.out.println("No hay celulares registrados");
		}
	}
	
	//realizar el menu intercativo para su parctica anterior con ls sigueintes opciones
	/*
	 * System.out.println("*****MENU******");
			System.out.println("1.- ALTA");
			System.out.println("2.- BUSCAR por atributo");
			System.out.println("3.- EDITAR");
			System.out.println("4.- ELIMINAR por atributo");
			System.out.println("5.- MOSTRAR");
			System.out.println("6.- CONTAR");
			System.out.println("7.- EIMINAR TODO");
			System.out.println("8.- SALIR");
			System.out.println("---Elige una opcion valida en el menu---");
			
			//AGREGAR VALIDACIONES: SI NO EXISTE NO SE PUEDE ELIMINAR, Y LO MISMO CON ELIMINAR
			 * PREGUNTAR ANTES SI, ESTAS SEGURO DE QUERER ELIMINAR
			 * PREGUNTAR SI ESTA SEGURO QUERER SALIR DEL MENU DE EDITAR
			 * PREGUNTAR SI ESTA SEGURO DE SALIR DEL MENU PRINCIPAL
	 * */

}//AQUI TERMINA MI CLASE
