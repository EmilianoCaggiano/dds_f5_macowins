package dds.macowins;

public class Sombrero extends Prenda {
	protected double precioBase;

	public Sombrero( double coeficienteDeMetrosexualidad){
		precioBase = 150*(1+coeficienteDeMetrosexualidad);
	}
	
	@Override
	protected double PrecioBase()
	{
		// TODO Auto-generated method stub
		return precioBase;
	}

}
