package clases.principales;

public abstract class Vehiculo {
	protected String marca;
	protected String modelo;
	protected Double precio;

	public Vehiculo(String marca, String modelo, Double precio) {

		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public abstract void setEstructura(String estructura);

	public abstract String getEstructura();

	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	

	

}
