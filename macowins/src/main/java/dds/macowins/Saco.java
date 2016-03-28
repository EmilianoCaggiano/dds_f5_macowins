package dds.macowins;

public class Saco extends Prenda 
{
	protected double PrecioBase;
	
	public Saco()
	{
		PrecioBase = 300;
	}
	
	@Override
	public double PrecioFinal() 
	{
		// TODO Auto-generated method stub
		return ValorNegocio + PrecioBase + PrecioImportacion() ;
	}
	
	@Override
	protected double PrecioBase()
	{
		// TODO Auto-generated method stub
		return PrecioBase;
	}

	

}
