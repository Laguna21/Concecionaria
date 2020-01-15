package clases.principales;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {

		return (v1.getPrecio().intValue() - v2.getPrecio().intValue()) * -1;
	}

}
