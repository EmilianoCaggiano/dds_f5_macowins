package dds.macowins;

public class Camisa extends Prenda 
{
	public Camisa()
	{
		PrecioBase = 200;
	}
	
	protected double PrecioBase;
	
	@Override
	protected double PrecioBase()
	{
		// TODO Auto-generated method stub
		return PrecioBase;
	}

	@Override
	public double PrecioFinal() {
		// TODO Auto-generated method stub
		return ValorNegocio + PrecioBase + PrecioImportacion() ;
	}

}

