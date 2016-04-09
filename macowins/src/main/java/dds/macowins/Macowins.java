package dds.macowins;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Macowins {

	public List<Venta> Ventas;

	public Macowins() {
		Ventas = new ArrayList<Venta>();
	}

	public double Ganancia(Calendar Fecha) {
		return Ventas.stream().filter(unaVenta -> unaVenta.Fecha == Fecha).mapToDouble(v -> v.ImporteTotal()).sum();
	}

}
