package dds.macowins;

public class Pantalon extends Prenda {
	protected double PrecioBase;

	public Pantalon() {
		PrecioBase = 250;
	}

	public double PrecioFinal() {
		// TODO Auto-generated method stub
		return ValorNegocio + PrecioBase + PrecioImportacion();
	}

	@Override
	protected double PrecioBase() {
		// TODO Auto-generated method stub
		return PrecioBase;
	}

}
