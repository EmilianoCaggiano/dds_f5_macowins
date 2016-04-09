package dds.macowins;

import java.util.Calendar;


public class Venta {

	public Prenda Prenda;
	public int Cantidad;
	public Calendar Fecha;
	
	public Venta (Calendar fecha)
	{
		Fecha = fecha;
	}
	
	public double ImporteTotal()
	{
		return Prenda.precioFinal() * Cantidad;
	}
	
	
}
