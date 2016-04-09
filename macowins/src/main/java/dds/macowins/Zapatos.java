package dds.macowins;

public class Zapatos extends Prenda {
	protected double precioBase;

	public Zapatos( double talle){
		precioBase = 400+ 5*talle;
	}
	
	@Override
	protected double PrecioBase()
	{
		// TODO Auto-generated method stub
		return precioBase;
	}

}
