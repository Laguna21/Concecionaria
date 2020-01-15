package clases.principales;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {
	private String cilindrada;

	public Moto(String marca, String modelo, String cilindrada, Double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	@Override
	public void setEstructura(String estructura) {
		this.cilindrada = estructura;

	}

	@Override
	public String getEstructura() {
		return this.cilindrada;
	}
	
	@Override
	public String toString() {
		DecimalFormat formatea = new DecimalFormat("###,###.##");
		return "Moto - Marca:" + marca + " // Modelo:" + modelo + " // Cilindrada:" + cilindrada + " // Precio: $" + formatea.format(precio);
	}

}
