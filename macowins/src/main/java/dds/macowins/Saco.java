package dds.macowins;

public class Saco extends Prenda 
{
	protected double PrecioBase;
	
	public Saco(double cantidadDeBotones, Marca marca)
	{
		PrecioBase = 300 + 10*cantidadDeBotones;
		this.marca = marca;
	}
	
	
	
	@Override
	protected double PrecioBase()
	{
		// TODO Auto-generated method stub
		return PrecioBase;
	}

	

}
