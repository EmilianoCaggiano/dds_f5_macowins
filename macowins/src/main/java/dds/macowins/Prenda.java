package dds.macowins;

public abstract class Prenda 
{
	public boolean Internacional;
	public static double TasaImportacion;
	protected Marca marca;
	
	public static double getTasaImportacion() {
		return TasaImportacion;
	}


	public static void setTasaImportacion(double tasaImportacion) {
		TasaImportacion = tasaImportacion;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public boolean isInternacional() {
		return Internacional;
	}


	public static double getValorNegocio() {
		return ValorNegocio;
	}
	//public double ValorNegocio = 100;  //esto habria que setearlo y no hardcodearlo aca pero no recuerdo como se le manda msj a la clase
	public static double ValorNegocio; 
	
	public Prenda()
	{
		Internacional = false; 
	}
	
	
	public  double precioFinal(){
		return (ValorNegocio + this.PrecioBase())*TasaImportacion*this.coeficienteDeMarca();
	}
	
	public double coeficienteDeMarca(){
		return marca.coeficiente(this.PrecioBase());
	}

	
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