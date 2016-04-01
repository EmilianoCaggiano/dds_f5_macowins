package dds.macowins;

public abstract class Prenda 
{
	public boolean Internacional;
	public static double TasaImportacion; 
	
	//public double ValorNegocio = 100;  //esto habria que setearlo y no hardcodearlo aca pero no recuerdo como se le manda msj a la clase
	public static double ValorNegocio; 
	
	public Prenda()
	{
		Internacional = false; 
	}
	
	public abstract double PrecioFinal(); 

	
	protected abstract double PrecioBase();
	protected double PrecioImportacion()
	{
		if (Internacional)
			return TasaImportacion;
		return 1;
	}
	
	protected void SetTasaImportacion(double valor)
	{
		TasaImportacion = valor;
	}
	public void setInternacional(boolean internacional) {
		Internacional = internacional;
	}
	public void setValorNegocio(double valorNegocio) {
		ValorNegocio = valorNegocio;
	}
	
}