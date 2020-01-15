package clases.principales;


import java.util.Comparator;
import java.util.LinkedList;


public class Concesionaria {
private LinkedList<Vehiculo> listaVehiculos;

public Concesionaria() {
	
	this.listaVehiculos = new LinkedList<Vehiculo>();
}
public void agregarVehiculo(Vehiculo v) {
	this.listaVehiculos.add(v);
}
public Vehiculo vehiculoMasCaro() {
	Vehiculo aux = this.listaVehiculos.getFirst();
	for (Vehiculo vehiculo : this.listaVehiculos) {
		if (aux.getPrecio() < vehiculo.getPrecio()) {
			aux = vehiculo;
		}
	}
	
	return aux;
}
public Vehiculo vehiculoMasBarato() {
	Vehiculo aux = this.listaVehiculos.getFirst();
	for (Vehiculo vehiculo : this.listaVehiculos) {
		if (aux.getPrecio() > vehiculo.getPrecio()) {
			aux = vehiculo;
		}
	}
	
	return aux;
}

public void ordenarLista(Comparator<Vehiculo> c) {
 this.listaVehiculos.sort(c);
}

public Vehiculo buscarPorModelo(String letra) throws ErrorModeloNoEncontrado {
	 for (Vehiculo vehiculo : listaVehiculos) {
		if (vehiculo.getModelo().contains(letra)) {
			return vehiculo;
		}
	}
	 throw new ErrorModeloNoEncontrado();
	}

public LinkedList<Vehiculo> getListaVehiculos() {
	return listaVehiculos;
}

public void mostrarListaPorConsola() {
	for (Vehiculo vehiculo : listaVehiculos) {
		System.err.println(vehiculo.toString());
	}
}
}
