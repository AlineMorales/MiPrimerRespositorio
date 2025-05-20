package com.mx.Coche;

public class Coche {
	//definicion de atributos: definicon de caracteristicas o propiedades que represntan la objeto
	private String marca;
	private String subMarca;
	private int modelo;
	private String color;
	private double precio;
	
	//Constructores: Inicializan el objeto, estos se ejecutan cuando se crea la instancia del objeto
	
	//constrcutor vacio o constructor por defecto 
	public Coche() {
		
	}
	
	//Constructor parametrizado: incializar el objeto con valores especificos(atributos)
	public Coche(String marca, String subMarca, int modelo, String color, double precio) {
		this.marca=marca;
		this.subMarca=subMarca;
		this.modelo=modelo;
		this.color=color;
		this.precio=precio;
	}
	
	//metodos get y set: se utilizan ya que los atributos fueron declrados en private, para
	//acceder y modificar estos atributos de una forma controlada
	
	//get obtiene el valor del atributo
	//Set modifica el valor del atributo con validaciones 
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public String getSubMarca() {
		return subMarca;
	}
	
	public void setSubMarcar(String subMarca) {
		this.subMarca = subMarca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	//metodo toString delcracion en las funcipones, sirve para cuqleuier objeto en cadena
	//Se utiliza para represenar un objeto en cadena y lo convierte en legible
	//(Es lo que se visulizara en la consola
	
	public String toString() {
		return "Coche[" + " marca= " + marca + " subMarca= " + subMarca + " modelo= " + modelo + 
				" Color= " + color + " precio= " + precio + "]\n";
	}
	

}
