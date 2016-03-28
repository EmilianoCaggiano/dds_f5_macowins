package dds.macowins;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Macowins {

	public List<Venta> Ventas;
	
	public Macowins()
	{
		Ventas = new ArrayList<Venta>();
	}

	public double Ganancia(Calendar Fecha) {
		double ganancia = 0;
		for (Venta venta : Ventas) {
			if (venta.Fecha.get(Calendar.YEAR) == Fecha.get(Calendar.YEAR)
					&& venta.Fecha.get(Calendar.DAY_OF_YEAR) == Fecha.get(Calendar.DAY_OF_YEAR)) {
				ganancia = ganancia + venta.ImporteTotal();
			}

		}
		return ganancia;
	}

}
