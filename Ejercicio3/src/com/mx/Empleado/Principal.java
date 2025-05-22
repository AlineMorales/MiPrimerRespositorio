package com.mx.Empleado;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		//instanciar
		Empleado e1 = new Empleado(289, "Raul", "Jimenez", "Auxiliar Administrativo", "RRHH", 557825682, 4000.00);
		Empleado e2 = new Empleado(300, "Roberto", "Jimenez", "Ventas", "Contabilidad", 1234567891, 6000);
		Empleado e3 = new Empleado(250, "Ruben", "Alvarez", "Asesor", "Contabilidad", 726589423, 7500);
		Empleado e4 = new Empleado(245, "Luis", "Acoltzi", "Jefe de de departamento", "Comunicacion", 546896875, 8000);
		Empleado e5 = new Empleado(230, "Carlos", "Aquino", "Soporte Técnico", "Mantenimiento", 557825682, 3500.00);
		Empleado e6 = new Empleado(298, "Enrique", "Osorio", "Auxiliar Administrativo", "Sistemas", 558554896, 10000);
		Empleado e7 = new Empleado(240, "Jesus", "Fuentes", "Soporte", "Mantenimiento", 273695048, 8000.00);
		Empleado e8 = new Empleado(210, "Jorge", "Domingues", "Operador", "Produccion", 254695846, 10000.00);
		
		//objeto auxiliar
		Empleado emp = null;
		//implementacion
		Implementacion imp = new Implementacion();
		
		//guardar
		imp.guardar(e1);
		imp.guardar(e2);
		imp.guardar(e3);
		imp.guardar(e4);
		imp.guardar(e5);
		imp.guardar(e6);
		imp.guardar(e7);
		imp.guardar(e8);
	/*	
		//mostrar 
		imp.mostrar();
		
		//buscar
		emp = new Empleado(289);
		emp = imp.buscar(emp);
		System.out.println("Encontrado: " + emp);
		
		//editar
		emp = new Empleado(300);
		emp = imp.buscar(emp);
		emp.setApellido("Gutierritos");
		emp.setDepartamento("Seguridad");
		imp.editar(emp);
		imp.mostrar();
		
		
		//eliminar
		emp = new Empleado(230);
		emp = imp.buscar(emp);
		imp.eliminar(emp);
		imp.mostrar();
		
		//contar
		imp.contar();*/
		
		
		///Menu interactivo 
		Scanner sc = new Scanner(System.in);
		int menuP =0, menuS=0;
		
		int clave, contacto;
		double sueldo;
		String nombre, apellido, puesto, departamento;
		
		do {
			mostrarMenu();
			menuP = sc.nextInt();
			sc.nextLine();
			
			switch(menuP) {
			case 1: 
				System.out.println("<<<<<<REGISTRO DE EMPLEADOS>>>>>>");
				System.out.println("Ingrese la clave del nuevo empleado");
				clave = sc.nextInt();
				sc.nextLine();
				if(imp.existeClave(clave)) {
					System.out.println("Error: Ya existe un empleado con esa clave");
					break;
				}
				System.out.println("Ingresa el nombre:");
				nombre = sc.nextLine();
				System.out.println("Ingresa Apellido");
				apellido = sc.nextLine();
				System.out.println("Ingresa Puesto");
				puesto = sc.nextLine();
				System.out.println("Ingresa Departamento");
				departamento = sc.nextLine();
				System.out.println("Ingresa Contacto");
				contacto = sc.nextInt();
				System.out.println("Ingresa Sueldo");
				sueldo = sc.nextDouble();
				
				Empleado empe = new Empleado(clave, nombre, apellido, puesto, departamento, contacto, sueldo);
				imp.guardar(empe);
				System.out.println("Empleado Registrado con Exito!!");
				break;
			case 2:
				System.out.println("<<<<<<<<<M O S T R A  R>>>>>>>>>");
				if(imp.hash.isEmpty()) {
					System.out.println("No hay empleados Registrados.");
				}else {
					imp.mostrar();
				}
				break;
			case 3:
				System.out.println("<<<<<<<E D I T A R>>>>>>>");
				imprimirDatosHash(imp);
				System.out.println("Ingrese la clave del empleado a editar");
				clave = sc.nextInt();
				sc.nextLine();
				
				Empleado editarE = imp.buscar(new Empleado(clave));
				if(editarE != null) {
					do {
						System.out.println("EDITANDO: " + editarE.getNombre());
						System.out.println("1.- NOMBRE");
						System.out.println("2.- APELLIDO");
						System.out.println("3.- PUESTO");
						System.out.println("4.- DEPARTAMENTO");
						System.out.println("5.- CONTACTO");
						System.out.println("6.- SUELDO");
						System.out.println("7.- MOSTRAR DATOS ACTUALES");
						System.out.println("8.- SALIR AL MENU PRINCIPAL");
						System.out.println("Seleciona un de la opciones");
						menuS = sc.nextInt();
						sc.nextLine();
						switch(menuS) {
						case 1:
							System.out.println("Escribe el nuevo nombre:");
							editarE.setNombre(sc.nextLine());
							break;
						case 2: 
							System.out.println("Escribe el nuevo apellido");
							editarE.setApellido(sc.nextLine());
							break;
						case 3: 
							System.out.println("Escribe el nuevo puesto");
							editarE.setPuesto(sc.nextLine());
							break;
						case 4: 
							System.out.println("Escribe el nuevo departamento");
							editarE.setPuesto(sc.nextLine());
							break;
						case 5:
							System.out.println("Escribe el nuevo constacto:");
							editarE.setContacto(sc.nextInt());
							break;
						case 6:
							System.out.println("Escribe el nuevo Sueldo");
							editarE.setSueldo(sc.nextDouble());
						case 7:
							System.out.println(editarE);
							break;
						case 8:
							System.out.println("Finalizado");
							imp.editar(editarE);
							break;
						default:
							System.out.println("Opcion no valida");							
						}
					}while(menuS != 8);
				}else {
					System.out.println("Empleado no encontrado");
				}
				break;
			case 4:
				System.out.println("<<<<<<<B U S C A R>>>>>>>");
				imprimirDatosHash(imp);
				System.out.println("Ingrese el nombre del empleado que desee buscar");
				nombre = sc.nextLine();
				buscarPorNombre(imp, nombre);
				break;
			case 5:
				System.out.println("<<<<<<E L I M I N A R>>>>>>");
				imprimirDatosHash(imp);
				System.out.println("Ingrese el nombre el empleado que desea eliminar");
				nombre = sc.nextLine();
				eliminarPorNombre(imp, nombre);
				break;
			case 6:
				System.out.println("<<<<<C O N T A R>>>>>");
				imp.contar();
				break;
			case 7:
				System.out.println("<<<<<L I M P I A R>>>>>");
				imp.hash.clear();
				System.out.println("Todos los empleados fueron eliminados.");
				break;
			case 8:
				System.out.println("Saliendo del menu!!!");
				break;
			default:
				System.out.println("Opcion invalida");

			}//final del switch
		}while(menuP != 8);//este indica final de main
		
	}

	private static void eliminarPorNombre(Implementacion imp, String nombre) {
		boolean eliminado = false;
		for(Empleado emp : imp.hash.values()) {
			if(emp.getNombre().equalsIgnoreCase(nombre)) {
				imp.eliminar(emp);
				System.out.println("Empleado eliminado: " + emp);
				eliminado = true;
				break;
			}
		}
		if(!eliminado) {
			System.out.println("No se encontro un empleado con ese nombre");
		}
	}

	private static void buscarPorNombre(Implementacion imp, String nombre) {
		boolean encontrado = false;
		for(Empleado emp : imp.hash.values()) {
			if(emp.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(emp);
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("No se encontro un empleado con ese nombre");
		}
		
	}

	private static void imprimirDatosHash(Implementacion imp) {
		System.out.println("\n----Lista de Empleados----\n");
		for(Empleado emp : imp.hash.values()) {
			System.out.println("Clave: " + emp.getClave() + " Nombre: " + emp.getNombre() + " " + emp.getApellido());
		}
		
	}

	private static void mostrarMenu() {
		System.out.println("\n---------MENU---------\n");
		System.out.println("1.- Agregar registro");
		System.out.println("2.- Mostrar la lista");
		System.out.println("3.- Editar");
		System.out.println("4.- Buscar por nombre");
		System.out.println("5.- Eliminar por nombre");
		System.out.println("6.- Contar elementos");
		System.out.println("7.- Eliminar todo");
		System.out.println("8.- Salir");
		System.out.println("SELECCIONA UNA OPCION");
		
	}//este indica final de clase
	
	//replicar el ejercicio con una entidad diferente.
	

}
