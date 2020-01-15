package clases.principales;

import java.text.DecimalFormat;

public class Auto extends Vehiculo {
	private String puertas;

	public Auto(String marca, String modelo, String puertas, Double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	@Override
	public void setEstructura(String estructura) {
		this.puertas = estructura;

	}

	@Override
	public String getEstructura() {
		return this.puertas;
	}

	@Override
	public String toString() {
		DecimalFormat formatea = new DecimalFormat("###,###.##");
		return "Auto - Marca: " + marca + " // Modelo:" + modelo + " // Puertas:" + puertas + " // Precio: $" + formatea.format(precio);
	}

}
