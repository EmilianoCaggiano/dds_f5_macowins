package dds.macowins;

public abstract class Prenda 
{
	public boolean Internacional;
	public double TasaImportacion;
	public double ValorNegocio;
	
	
	public abstract double PrecioFinal();
	protected abstract double PrecioBase();
	protected double PrecioImportacion()
	{
		if (Internacional)
			return TasaImportacion;
		return 0;
	}
	protected void SetTasaImportacion(double valor)
	{
		TasaImportacion = valor;
	}
}