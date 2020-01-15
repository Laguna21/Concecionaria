package main;

import clases.principales.*;

public class Main {

	public static void main(String[] args) {
		Vehiculo auto1 = new Auto("Peugeot", "206", "4", 200000.00d);
		Vehiculo moto1 = new Moto("Honda", "Titan", "125c", 60000.00d);
		Vehiculo auto2 = new Auto("Peugeot", "208", "5", 250000.00d);
		Vehiculo moto2 = new Moto("Yamaha", "YBR", "160c", 80500.50d);

		Concesionaria laguna = new Concesionaria();
		laguna.agregarVehiculo(auto1);
		laguna.agregarVehiculo(moto1);
		laguna.agregarVehiculo(auto2);
		laguna.agregarVehiculo(moto2);

		laguna.mostrarListaPorConsola();

		System.out.println();
		// Ordenar lista
		laguna.ordenarLista(new OrdenarPorPrecio());
		System.out.println("Lista ordenada de mayor a menor");
		
		
		laguna.mostrarListaPorConsola();

		System.out.println();
		// Vehiculo con mayor precio
		System.out.println("El vehiculo con mayor precio es: " + laguna.vehiculoMasCaro().toString());

		// Vehiculo con Menor precio
		System.out.println("El vehiculo con menor precio es: " + laguna.vehiculoMasBarato().toString());

		System.out.println();
		//Buscar por Modelo
		try {
			System.out.println("Vehículo que contiene en el modelo la letra ‘Y’ : " + laguna.buscarPorModelo("Y").toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
