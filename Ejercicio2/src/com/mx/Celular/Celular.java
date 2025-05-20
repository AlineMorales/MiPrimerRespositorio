package com.mx.Celular;

public class Celular {
	
	private String marca;
	private String modelo;
	private int ram;
	private String color;
	private int almacenamiento;
	private double precio;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, int ram, String color, int almacenamiento, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ram = ram;
		this.color = color;
		this.almacenamiento = almacenamiento;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", color=" + color
				+ ", almacenamiento=" + almacenamiento + ", precio=" + precio + "]\n";
	}
	
	
	

}
